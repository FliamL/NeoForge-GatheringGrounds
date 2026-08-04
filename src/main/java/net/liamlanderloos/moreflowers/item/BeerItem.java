package net.liamlanderloos.moreflowers.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;

public class BeerItem extends Item {
    public BeerItem(Properties pProperties) {
        super(pProperties.food(new FoodProperties.Builder().alwaysEdible()
                        .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F)
                        .build())
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(1));
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
