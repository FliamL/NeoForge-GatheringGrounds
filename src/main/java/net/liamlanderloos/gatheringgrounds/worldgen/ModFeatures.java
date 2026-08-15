package net.liamlanderloos.gatheringgrounds.worldgen;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(BuiltInRegistries.FEATURE, GatheringGrounds.MOD_ID);

    public static final DeferredHolder<Feature<?>, HopsVinesFeature> HOPS_VINES =
            FEATURES.register("hops_vines", () -> new HopsVinesFeature(NoneFeatureConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
