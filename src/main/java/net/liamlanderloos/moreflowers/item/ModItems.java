package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreFlowers.MOD_ID);

    public static final DeferredItem<Item> TANSY = ITEMS.register("tansy",
            () -> new BlockItem(
                    ModBlocks.TANSY_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> COMFREY = ITEMS.register("comfrey",
            () -> new BlockItem(
                    ModBlocks.COMFREY_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> HOREHOUND = ITEMS.register("horehound",
            () -> new BlockItem(
                    ModBlocks.HOREHOUND_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> HYSOP = ITEMS.register("hysop",
            () -> new BlockItem(
                    ModBlocks.HYSOP_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> LAVENDER = ITEMS.register("lavender",
            () -> new BlockItem(
                    ModBlocks.LAVENDER_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> LOVAGE = ITEMS.register("lovage",
            () -> new BlockItem(
                    ModBlocks.LOVAGE_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> MARIGOLD = ITEMS.register("marigold",
            () -> new BlockItem(
                    ModBlocks.MARIGOLD_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> MINT = ITEMS.register("mint",
            () -> new BlockItem(
                    ModBlocks.MINT_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.register("tansy_pancake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TANSY_PANCAKE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
