package net.liamlanderloos.gatheringgrounds.potion;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(BuiltInRegistries.POTION, GatheringGrounds.MOD_ID);

    public static final Holder<Potion> CUP_OF_WATER_POTION = POTIONS.register("cup_of_water_potion",
            () -> new Potion("cup_of_water_potion"));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
