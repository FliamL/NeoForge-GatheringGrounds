package net.liamlanderloos.gatheringgrounds.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ChamomileTeaItem extends Item {
    public ChamomileTeaItem(Properties pProperties) {
        super(pProperties.food(
                        new FoodProperties.Builder().alwaysEdible().build(),
                        Consumables.defaultDrink()
                                .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                                        new MobEffectInstance(MobEffects.STRENGTH, 600, 1),
                                        new MobEffectInstance(MobEffects.SPEED, 600, 1)
                                )))
                                .build()
                )
                .craftRemainder(ModItems.CUP.get()).stacksTo(1));
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack pStack) {
        return ItemUseAnimation.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity pLivingEntity) {
        return 32;
    }
}
