package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreFlowers.MOD_ID);

    public static final Supplier<CreativeModeTab> FLOWER_ITEMS_TAB = CREATIVE_MODE_TAB.register("flower_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TANSY.get()))
                    .title(Component.translatable("creativetab.moreflowers.flower_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TANSY);
                        output.accept(ModItems.TANSY_PANCAKE);
                        output.accept((ModBlocks.MUD_POT));
                        output.accept(ModItems.COMFREY);
                        output.accept(ModItems.HOREHOUND);
                        output.accept(ModItems.HYSOP);
                        output.accept(ModItems.LAVENDER);
                        output.accept(ModItems.LOVAGE);
                        output.accept(ModItems.MARIGOLD);
                        output.accept(ModItems.MINT);
                        output.accept(ModItems.NETTLE);
                        output.accept(ModItems.PEPPERMINT);
                        output.accept(ModItems.PLANTAIN);
                        output.accept(ModItems.ROSEMARY);
                        output.accept(ModItems.ROZENBOTTEL);
                        output.accept(ModItems.RUE);
                        output.accept(ModItems.SAGE);
                        output.accept(ModItems.TANSYFLOWERING);
                        output.accept(ModItems.THYME);
                        output.accept(ModItems.VALERIAN);
                        output.accept(ModItems.WORMWOOD);
                        output.accept(ModItems.YARROW);
                        output.accept(ModItems.DANDELIONBLOOM);
                        output.accept(ModItems.ELDER);
                        output.accept(ModItems.FENNEL);
                        output.accept(ModItems.CHAMOMILE);
                        output.accept(ModItems.CHAMOMILE_CAKE);
                        output.accept(ModItems.CHAMOMILE_TEA);
                        output.accept(ModItems.CUP);
                        output.accept(ModItems.HOPS);
                        output.accept(ModItems.HOPS_SEED);
                        output.accept(ModItems.CUP_OF_WATER);
                        output.accept(ModItems.BEER);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
