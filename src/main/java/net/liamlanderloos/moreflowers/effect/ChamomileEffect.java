package net.liamlanderloos.moreflowers.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ChamomileEffect extends MobEffect {
    public ChamomileEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide && livingEntity.level() instanceof ServerLevel serverLevel) {
            // Set time to day (1000 is approximately 7:00 AM)
            serverLevel.setDayTime(1000);
        }
        return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        // Trigger once when the effect is applied
        return duration == 1;
    }
}
