package net.liamlanderloos.moreflowers.potion;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, MoreFlowers.MOD_ID);

    public static final Holder<Potion> CHAMOMILE_TEA_POTION = POTIONS.register("chamomile_tea_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.CHAMOMILE_EFFECT, 1200, 0)));

    public static final Holder<Potion> CUP_OF_WATER_POTION = POTIONS.register("cup_of_water_potion",
            () -> new Potion());

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
