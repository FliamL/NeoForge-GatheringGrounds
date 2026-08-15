package net.liamlanderloos.gatheringgrounds.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class BeerItem extends Item {
    public BeerItem(Properties pProperties) {
        super(pProperties.food(
                        new FoodProperties.Builder().alwaysEdible().build(),
                        Consumables.defaultDrink()
                                .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.NAUSEA, 600, 0), 1.0F))
                                .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(1));
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
