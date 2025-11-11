package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TANSY = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(ModEffects.TANSY_EFFECT, 100), 1f)
            .build();

    public static final FoodProperties TANSY_PANCAKE = new FoodProperties
            .Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(ModEffects.TANSY_EFFECT, 400), 1f)
            .build();
}
