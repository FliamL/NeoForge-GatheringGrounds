package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TANSY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(ModEffects.TANSY_EFFECT, 100), 1f)
            .build();

    public static final FoodProperties TANSYFLOWERING = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 1f) // 5 seconds of Poison
            .build();

    public static final FoodProperties COMFREY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFREY_EFFECT, 200), 1f)
            .build();

    public static final FoodProperties MINT = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();

    public static final FoodProperties ROZENBOTTEL = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();

    public static final FoodProperties HOREHOUND = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1f)
            .build();

    public static final FoodProperties CHAMOMILE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1), 1f)
            .build();

    public static final FoodProperties TANSY_PANCAKE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(ModEffects.TANSY_EFFECT, 400), 1f)
            .build();

    public static final FoodProperties CHAMOMILE_CAKE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
}
