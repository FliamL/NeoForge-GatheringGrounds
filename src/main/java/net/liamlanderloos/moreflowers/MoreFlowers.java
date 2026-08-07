package net.liamlanderloos.moreflowers;

import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.liamlanderloos.moreflowers.event.PlayerDeathHandler;
import net.liamlanderloos.moreflowers.item.ModCreativeModeTabs;
import net.liamlanderloos.moreflowers.item.ModItems;
import net.liamlanderloos.moreflowers.potion.ModPotions;
import net.liamlanderloos.moreflowers.worldgen.ModFeatures;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MoreFlowers.MOD_ID)
public class MoreFlowers {
    public static final String MOD_ID = "moreflowers";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MoreFlowers(IEventBus modEventBus, ModContainer modContainer) {
        ModCreativeModeTabs.register(modEventBus);
        PlayerDeathHandler.register();
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModFeatures.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
