package net.liamlanderloos.moreflowers.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.clock.WorldClock;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChamomileCakeItem extends Item {
    public ChamomileCakeItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        ItemStack result = super.finishUsingItem(stack, level, livingEntity);
        if (!level.isClientSide() && level instanceof ServerLevel serverLevel) {
            // Set time to day (1000 is approximately 7:00 AM)
            java.util.Optional<Holder<WorldClock>> defaultClock = serverLevel.dimensionType().defaultClock();
            defaultClock.ifPresent(clock -> serverLevel.getServer().clockManager().setTotalTicks(clock, 1000));

            if (livingEntity instanceof ServerPlayer player) {
                player.sendSystemMessage(
                        Component.literal("The Chamomile's calm dispels the night!")
                                .withStyle(ChatFormatting.AQUA, ChatFormatting.BOLD)
                );
            }
        }
        return result;
    }
}
