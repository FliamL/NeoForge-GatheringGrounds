package net.liamlanderloos.moreflowers.item;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class CupItem extends Item {
    public CupItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        HitResult hitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        if (hitresult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockpos = ((BlockHitResult)hitresult).getBlockPos();
            FluidState fluidstate = level.getFluidState(blockpos);
            if (fluidstate.is(Fluids.WATER)) {
                level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);
                player.awardStat(Stats.ITEM_USED.get(this));
                return InteractionResultHolder.sidedSuccess(ItemUtils.createFilledResult(itemstack, player, ModItems.CUP_OF_WATER.get().getDefaultInstance()), level.isClientSide());
            }
        }
        return InteractionResultHolder.pass(itemstack);
    }
}
