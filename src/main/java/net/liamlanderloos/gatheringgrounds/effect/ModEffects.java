package net.liamlanderloos.gatheringgrounds.effect;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, GatheringGrounds.MOD_ID);
    
    public static final Holder<MobEffect> TANSY_EFFECT = MOB_EFFECTS.register("tansy",
            () -> new TansyEffect(MobEffectCategory.NEUTRAL, 0xd4aa39));

    public static final Holder<MobEffect> COMFREY_EFFECT = MOB_EFFECTS.register("comfrey",
            () -> new ComfreyEffect(MobEffectCategory.BENEFICIAL, 0x4a7c2f));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
