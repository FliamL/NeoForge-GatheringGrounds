package net.liamlanderloos.moreflowers.item;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreFlowers.MOD_ID);

    public static final DeferredItem<Item> TANSY = registerHerbFood("tansy", ModBlocks.TANSY_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> COMFREY = registerHerbFood("comfrey", ModBlocks.COMFREY_BLOCK, ModFoodProperties.COMFREY);
    public static final DeferredItem<Item> HOREHOUND = registerHerbFood("horehound", ModBlocks.HOREHOUND_BLOCK, ModFoodProperties.HOREHOUND);
    public static final DeferredItem<Item> HYSOP = registerHerbFood("hysop", ModBlocks.HYSOP_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> LAVENDER = registerHerbFood("lavender", ModBlocks.LAVENDER_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> LOVAGE = registerHerbFood("lovage", ModBlocks.LOVAGE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> MARIGOLD = registerHerbFood("marigold", ModBlocks.MARIGOLD_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> MINT = registerHerbFood("mint", ModBlocks.MINT_BLOCK, ModFoodProperties.MINT);
    public static final DeferredItem<Item> NETTLE = registerHerbFood("nettle", ModBlocks.NETTLE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> PEPPERMINT = registerHerbFood("peppermint", ModBlocks.PEPPERMINT_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> PLANTAIN = registerHerbFood("plantain", ModBlocks.PLANTAIN_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> ROSEMARY = registerHerbFood("rosemary", ModBlocks.ROSEMARY_BLOCK, ModFoodProperties.TANSY);

    public static final DeferredItem<Item> ROZENBOTTEL = ITEMS.register("rozenbottel",
            () -> new RozenbottelItem(
                    ModBlocks.ROZENBOTTEL_BLOCK.get(), // the block itself
                    new Item.Properties().food(ModFoodProperties.ROZENBOTTEL) // edible properties
            ));

    public static final DeferredItem<Item> RUE = registerHerbFood("rue", ModBlocks.RUE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> SAGE = registerHerbFood("sage", ModBlocks.SAGE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> TANSYFLOWERING = registerHerbFood("tansyflowering", ModBlocks.TANSYFLOWERING_BLOCK, ModFoodProperties.TANSYFLOWERING);
    public static final DeferredItem<Item> THYME = registerHerbFood("thyme", ModBlocks.THYME_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> VALERIAN = registerHerbFood("valerian", ModBlocks.VALERIAN_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> WORMWOOD = registerHerbFood("wormwood", ModBlocks.WORMWOOD_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> YARROW = registerHerbFood("yarrow", ModBlocks.YARROW_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> DANDELIONBLOOM = registerHerbFood("dandelionbloom", ModBlocks.DANDELIONBLOOM_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> ELDER = registerHerbFood("elder", ModBlocks.ELDER_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> FENNEL = registerHerbFood("fennel", ModBlocks.FENNEL_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> CHAMOMILE = registerHerbFood("chamomile", ModBlocks.CHAMOMILE_BLOCK, ModFoodProperties.CHAMOMILE);

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
            () -> new ChamomileTeaItem(new Item.Properties()));

    public static final DeferredItem<Item> BEER = ITEMS.register("beer",
            () -> new BeerItem(new Item.Properties()));

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.register("tansy_pancake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TANSY_PANCAKE)));

    public static final DeferredItem<Item> CHAMOMILE_CAKE = ITEMS.register("chamomile_cake",
            () -> new ChamomileCakeItem(new Item.Properties().food(ModFoodProperties.CHAMOMILE_CAKE)));

    private static DeferredItem<Item> registerHerbFood(String name, DeferredBlock<Block> block, FoodProperties food) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().food(food)));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
