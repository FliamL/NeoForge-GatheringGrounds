package net.liamlanderloos.moreflowers.client;


import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(modid = MoreFlowers.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TANSY_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.COMFREY_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HOREHOUND_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HYSOP_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LOVAGE_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MARIGOLD_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINT_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETTLE_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEPPERMINT_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLANTAIN_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROSEMARY_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROZENBOTTEL_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RUE_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SAGE_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TANSYFLOWERING_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.THYME_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VALERIAN_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WORMWOOD_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YARROW_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DANDELIONBOOM_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ELDER_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FENNEL_BLOCK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HOPS_BLOCK.get(), RenderType.cutout());
        });
    }
}