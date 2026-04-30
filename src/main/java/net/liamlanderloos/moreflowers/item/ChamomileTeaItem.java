package net.liamlanderloos.moreflowers.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ChamomileTeaItem extends Item {
    public ChamomileTeaItem(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {
        return 32; // Same as potions
    }
}
