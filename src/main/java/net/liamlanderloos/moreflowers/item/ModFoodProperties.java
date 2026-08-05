package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoodProperties {
    public static final FoodProperties TANSY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
    public static final Consumable TANSY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.TANSY_EFFECT, 100)))
            .build();

    public static final FoodProperties TANSYFLOWERING = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
    public static final Consumable TANSYFLOWERING_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 100))) // 5 seconds of Poison
            .build();

    public static final FoodProperties COMFREY = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
    public static final Consumable COMFREY_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.COMFREY_EFFECT, 200)))
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
            .build();
    public static final Consumable HOREHOUND_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 1200, 1)))
            .build();

    public static final FoodProperties CHAMOMILE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
    public static final Consumable CHAMOMILE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 200, 1)))
            .build();

    public static final FoodProperties TANSY_PANCAKE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .build();
    public static final Consumable TANSY_PANCAKE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.TANSY_EFFECT, 400)))
            .build();

    public static final FoodProperties CHAMOMILE_CAKE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
}
