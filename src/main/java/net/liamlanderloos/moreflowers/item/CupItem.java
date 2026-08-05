package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.potion.ModPotions;
import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.List;


public class CupItem extends Item {
    public CupItem(Item.Properties properties) {
        super(properties);
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see .
     */
    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        List<AreaEffectCloud> list = level.getEntitiesOfClass(
                AreaEffectCloud.class,
                player.getBoundingBox().inflate(2.0),
                p_350149_ -> p_350149_ != null && p_350149_.isAlive() && p_350149_.getOwner() instanceof EnderDragon
        );
        ItemStack itemstack = player.getItemInHand(hand);
        if (!list.isEmpty()) {
            AreaEffectCloud areaeffectcloud = list.get(0);
            areaeffectcloud.setRadius(areaeffectcloud.getRadius() - 0.5F);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL_DRAGONBREATH, SoundSource.NEUTRAL, 1.0F, 1.0F);
            level.gameEvent(player, GameEvent.FLUID_PICKUP, player.position());
            if (player instanceof ServerPlayer serverplayer) {
                CriteriaTriggers.PLAYER_INTERACTED_WITH_ENTITY.trigger(serverplayer, itemstack, areaeffectcloud);
            }

            return InteractionResult.SUCCESS.heldItemTransformedTo(
                    this.turnBottleIntoItem(itemstack, player, new ItemStack(Items.DRAGON_BREATH))
            );
        } else {
            BlockHitResult blockhitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
            if (blockhitresult.getType() == HitResult.Type.MISS) {
                return InteractionResult.PASS;
            } else {
                if (blockhitresult.getType() == HitResult.Type.BLOCK) {
                    BlockPos blockpos = blockhitresult.getBlockPos();
                    if (!level.mayInteract(player, blockpos)) {
                        return InteractionResult.PASS;
                    }

                    if (level.getFluidState(blockpos).is(FluidTags.WATER)) {
                        level.playSound(
                                player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F
                        );
                        level.gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);
                        return InteractionResult.SUCCESS.heldItemTransformedTo(
                                this.turnBottleIntoItem(itemstack, player, PotionContents.createItemStack(ModItems.CUP_OF_WATER.get(), ModPotions.CUP_OF_WATER_POTION))
                        );
                    }
                }

                return InteractionResult.PASS;
            }
        }
    }

    protected ItemStack turnBottleIntoItem(ItemStack bottleStack, Player player, ItemStack filledBottleStack) {
        player.awardStat(Stats.ITEM_USED.get(this));
        return ItemUtils.createFilledResult(bottleStack, player, filledBottleStack);
    }
}
