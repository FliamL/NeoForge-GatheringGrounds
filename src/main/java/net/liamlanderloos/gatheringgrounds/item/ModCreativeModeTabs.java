package net.liamlanderloos.gatheringgrounds.item;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.liamlanderloos.gatheringgrounds.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GatheringGrounds.MOD_ID);

    public static final Supplier<CreativeModeTab> FLOWER_ITEMS_TAB = CREATIVE_MODE_TAB.register("flower_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TANSY.get()))
                    .title(Component.translatable("creativetab.gatheringgrounds.flower_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TANSY);
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
                    })
                    .build());

    public static final Supplier<CreativeModeTab> FLOWER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("flower_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MUD_POT.get()))
                    .title(Component.translatable("creativetab.gatheringgrounds.flower_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MUD_POT);
                        output.accept(ModItems.HOPS);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> POTIONS_TAB = CREATIVE_MODE_TAB.register("potions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAMOMILE_TEA.get()))
                    .title(Component.translatable("creativetab.gatheringgrounds.potions"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CUP);
                        output.accept(ModItems.CUP_OF_WATER);
                        output.accept(ModItems.HOPS_SEED);
                        output.accept(ModItems.CHAMOMILE_TEA);
                        output.accept(ModItems.MOROCCAN_MINT_TEA);
                        output.accept(ModItems.BEER);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> FOOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("food_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHAMOMILE_CAKE.get()))
                    .title(Component.translatable("creativetab.gatheringgrounds.food_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TANSY_PANCAKE);
                        output.accept(ModItems.CHAMOMILE_CAKE);
                        output.accept(ModItems.MINER_LUNG_CANDY);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
