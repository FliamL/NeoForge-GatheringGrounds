package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreFlowers.MOD_ID);

    public static final DeferredItem<Item> TANSY = ITEMS.register("tansy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.register("tansy_pancake",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
