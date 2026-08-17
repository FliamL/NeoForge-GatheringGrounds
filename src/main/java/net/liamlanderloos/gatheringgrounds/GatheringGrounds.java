package net.liamlanderloos.gatheringgrounds;

import net.liamlanderloos.gatheringgrounds.block.ModBlocks;
import net.liamlanderloos.gatheringgrounds.effect.ModEffects;
import net.liamlanderloos.gatheringgrounds.event.PlayerDeathHandler;
import net.liamlanderloos.gatheringgrounds.item.ModCreativeModeTabs;
import net.liamlanderloos.gatheringgrounds.item.ModItems;
import net.liamlanderloos.gatheringgrounds.potion.ModPotions;
import net.liamlanderloos.gatheringgrounds.sound.ModSounds;
import net.liamlanderloos.gatheringgrounds.worldgen.ModFeatures;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(GatheringGrounds.MOD_ID)
public class GatheringGrounds {
    public static final String MOD_ID = "gatheringgrounds";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public GatheringGrounds(IEventBus modEventBus, ModContainer modContainer) {
        ModCreativeModeTabs.register(modEventBus);
        PlayerDeathHandler.register();
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);
        ModSounds.register(modEventBus);
        ModPotions.register(modEventBus);
        ModFeatures.register(modEventBus);
        modEventBus.addListener(ModBlocks::commonSetup);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
