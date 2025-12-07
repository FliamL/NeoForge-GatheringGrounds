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
                    })
                    .build());

//    public static final Supplier<CreativeModeTab> FLOWER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("flower_blocks_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TANSY.get()))
//                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MoreFlowers.MOD_ID, "flower_items_tab"))
//                    .title(Component.translatable("creativetab.moreflowers.flower_blocks"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.TANSY);
//                        output.accept(ModItems.TANSY_PANCAKE);
//
//                    })
//                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
