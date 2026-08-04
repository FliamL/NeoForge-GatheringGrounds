package net.liamlanderloos.moreflowers.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class ComfreyEffect extends MobEffect {
    private static final int REPAIR_PER_TICK = 1;

    public ComfreyEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        repairMostDamagedItem(livingEntity);
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    private void repairMostDamagedItem(LivingEntity livingEntity) {
        ItemStack target = null;
        int mostDamage = 0;

        ItemStack mainHand = livingEntity.getMainHandItem();
        if (isDamaged(mainHand)) {
            target = mainHand;
            mostDamage = mainHand.getDamageValue();
        }

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() != EquipmentSlot.Type.HUMANOID_ARMOR) {
                continue;
            }
            ItemStack armor = livingEntity.getItemBySlot(slot);
            if (isDamaged(armor) && (target == null || armor.getDamageValue() > mostDamage)) {
                target = armor;
                mostDamage = armor.getDamageValue();
            }
        }

        if (target != null) {
            target.setDamageValue(Math.max(0, target.getDamageValue() - REPAIR_PER_TICK));
        }
    }

    private boolean isDamaged(ItemStack stack) {
        return !stack.isEmpty() && stack.isDamageableItem() && stack.getDamageValue() > 0;
    }
}
