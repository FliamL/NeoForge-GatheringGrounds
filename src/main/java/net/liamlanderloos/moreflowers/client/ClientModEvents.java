package net.liamlanderloos.moreflowers.client;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.api.distmarker.Dist;

// Block render layers (solid/cutout/translucent) are now determined automatically from each
// texture's transparency, so no manual RenderType registration is needed anymore.
@EventBusSubscriber(modid = MoreFlowers.MOD_ID, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
    }
}
