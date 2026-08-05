package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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
                    new Item.Properties().food(ModFoodProperties.COMFREY) // edible properties
            ));

    public static final DeferredItem<Item> HOREHOUND = ITEMS.register("horehound",
            () -> new BlockItem(
                    ModBlocks.HOREHOUND_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.HOREHOUND) // edible properties
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
                    new Item.Properties().food(ModFoodProperties.MINT) // edible properties
            ));

    public static final DeferredItem<Item> NETTLE = ITEMS.register("nettle",
            () -> new BlockItem(
                    ModBlocks.NETTLE_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> PEPPERMINT = ITEMS.register("peppermint",
            () -> new BlockItem(
                    ModBlocks.PEPPERMINT_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> PLANTAIN = ITEMS.register("plantain",
            () -> new BlockItem(
                    ModBlocks.PLANTAIN_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new BlockItem(
                    ModBlocks.ROSEMARY_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> ROZENBOTTEL = ITEMS.register("rozenbottel",
            () -> new RozenbottelItem(
                    ModBlocks.ROZENBOTTEL_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.ROZENBOTTEL) // edible properties
            ));

    public static final DeferredItem<Item> RUE = ITEMS.register("rue",
            () -> new BlockItem(
                    ModBlocks.RUE_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> SAGE = ITEMS.register("sage",
            () -> new BlockItem(
                    ModBlocks.SAGE_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> TANSYFLOWERING = ITEMS.register("tansyflowering",
            () -> new BlockItem(
                    ModBlocks.TANSYFLOWERING_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSYFLOWERING) // edible properties
            ));

    public static final DeferredItem<Item> THYME = ITEMS.register("thyme",
            () -> new BlockItem(
                    ModBlocks.THYME_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> VALERIAN = ITEMS.register("valerian",
            () -> new BlockItem(
                    ModBlocks.VALERIAN_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> WORMWOOD = ITEMS.register("wormwood",
            () -> new BlockItem(
                    ModBlocks.WORMWOOD_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> YARROW = ITEMS.register("yarrow",
            () -> new BlockItem(
                    ModBlocks.YARROW_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> DANDELIONBLOOM = ITEMS.register("dandelionbloom",
            () -> new BlockItem(
                    ModBlocks.DANDELIONBOOM_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> ELDER = ITEMS.register("elder",
            () -> new BlockItem(
                    ModBlocks.ELDER_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> FENNEL = ITEMS.register("fennel",
            () -> new BlockItem(
                    ModBlocks.FENNEL_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.TANSY) // edible properties
            ));

    public static final DeferredItem<Item> CHAMOMILE = ITEMS.register("chamomile",
            () -> new BlockItem(
                    ModBlocks.CHAMOMILE_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.CHAMOMILE) // edible properties
            ));

    public static final DeferredItem<Item> HOPS = ITEMS.register("hops",
            () -> new BlockItem(
                    ModBlocks.HOPS_BLOCK.get(),
                    new Item.Properties()
            )
    );

    public static final DeferredItem<Item> HOPS_SEED = ITEMS.register("hops_seed",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CUP = ITEMS.register("cup",
            () -> new CupItem(new Item.Properties()));

    public static final DeferredItem<Item> CUP_OF_WATER = ITEMS.register("cup_of_water",
            () -> new CupOfWaterItem(new Item.Properties().craftRemainder(ModItems.CUP.get()).stacksTo(1)));

    public static final DeferredItem<Item> CHAMOMILE_TEA = ITEMS.register("chamomile_tea",
            () -> new ChamomilleTeaItem(new Item.Properties()));

    public static final DeferredItem<Item> BEER = ITEMS.register("beer",
            () -> new BeerItem(new Item.Properties()));

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.register("tansy_pancake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TANSY_PANCAKE)));

    public static final DeferredItem<Item> CHAMOMILE_CAKE = ITEMS.register("chamomile_cake",
            () -> new ChamomileCakeItem(new Item.Properties().food(ModFoodProperties.CHAMOMILE_CAKE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
