package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ChamomilleTeaItem extends Item {
    public ChamomilleTeaItem(Properties pProperties) {
        super(pProperties.food(new FoodProperties.Builder().alwaysEdible().effect(() ->
                new MobEffectInstance(ModEffects.CHAMOMILE_EFFECT, 1200, 0), 1.0F).build())
                .craftRemainder(ModItems.CUP.get()).stacksTo(1));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity pLivingEntity) {
        return 32;
    }
}