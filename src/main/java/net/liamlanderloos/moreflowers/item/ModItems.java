package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreFlowers.MOD_ID);

    public static final DeferredItem<Item> TANSY = ITEMS.register("tansy",
            () -> new ItemNameBlockItem(
                    ModBlocks.TANSY_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.register("tansy_pancake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TANSY_PANCAKE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
