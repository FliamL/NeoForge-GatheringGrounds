package net.liamlanderloos.gatheringgrounds.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumables;

public class MoroccanMintTeaItem extends Item {
    public MoroccanMintTeaItem(Properties pProperties) {
        super(pProperties.food(
                        ModFoodProperties.MOROCCAN_MINT_TEA,
                        Consumables.defaultDrink().build()
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
