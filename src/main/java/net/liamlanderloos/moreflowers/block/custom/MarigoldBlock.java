package net.liamlanderloos.moreflowers.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class MarigoldBlock extends FlowerBlock {
    public MarigoldBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
        super(effect, seconds, properties);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide) {
            level.scheduleTick(pos, this, 1);
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        repelEnemies(level, pos);
        level.scheduleTick(pos, this, 1);
    }

    private void repelEnemies(Level level, BlockPos pos) {
        double radius = 7;
        AABB area = new AABB(pos).inflate(radius);
        List<Entity> enemies = level.getEntities((Entity) null, area, entity -> entity instanceof Enemy && entity instanceof Mob);

        Vec3 blockVec = Vec3.atCenterOf(pos);

        for (Entity entity : enemies) {
            Mob mob = (Mob) entity;
            Vec3 entityVec = mob.position();
            
            // Vector pointing away from the block
            Vec3 repelDir = entityVec.subtract(blockVec).normalize();
            
            if (entityVec.distanceTo(blockVec) < radius) {
                // Clear the mob's target to make it "fear" and disengage
                mob.setTarget(null);

                // Apply a physical push
                mob.setDeltaMovement(repelDir.scale(0.7));
                mob.hasImpulse = true;
                
                if (mob instanceof Phantom phantom) {
                    // Phantoms use a special movement controller for flying
                    // We can try to force them to fly upwards and away
                    Vec3 fleePos = entityVec.add(repelDir.scale(10)).add(0, 5, 0);
                    phantom.getMoveControl().setWantedPosition(fleePos.x, fleePos.y, fleePos.z, 1.5);
                } else {
                    // Regular ground mobs use navigation
                    Vec3 targetPos = entityVec.add(repelDir.scale(5));
                    mob.getNavigation().moveTo(targetPos.x, targetPos.y, targetPos.z, 1.5);
                }
            }
        }
    }
}
