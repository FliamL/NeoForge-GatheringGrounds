package net.liamlanderloos.gatheringgrounds.item;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.liamlanderloos.gatheringgrounds.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GatheringGrounds.MOD_ID);

    public static final DeferredItem<Item> TANSY = registerHerbFood("tansy", ModBlocks.TANSY_BLOCK, ModFoodProperties.TANSY, ModFoodProperties.TANSY_CONSUMABLE);
    public static final DeferredItem<Item> COMFREY = registerHerbFood("comfrey", ModBlocks.COMFREY_BLOCK, ModFoodProperties.COMFREY, ModFoodProperties.COMFREY_CONSUMABLE);
    public static final DeferredItem<Item> HOREHOUND = ITEMS.registerItem("horehound",
            properties -> new BlockItem(ModBlocks.HOREHOUND_BLOCK.get(), properties),
            Item.Properties::new);
    public static final DeferredItem<Item> HYSOP = registerHerbFood("hysop", ModBlocks.HYSOP_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> LAVENDER = registerHerbFood("lavender", ModBlocks.LAVENDER_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> LOVAGE = registerHerbFood("lovage", ModBlocks.LOVAGE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> MARIGOLD = registerHerbFood("marigold", ModBlocks.MARIGOLD_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> MINT = ITEMS.registerItem("mint",
            properties -> new BlockItem(ModBlocks.MINT_BLOCK.get(), properties),
            Item.Properties::new);
    public static final DeferredItem<Item> NETTLE = registerHerbFood("nettle", ModBlocks.NETTLE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> PEPPERMINT = registerHerbFood("peppermint", ModBlocks.PEPPERMINT_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> PLANTAIN = registerHerbFood("plantain", ModBlocks.PLANTAIN_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> ROSEMARY = registerHerbFood("rosemary", ModBlocks.ROSEMARY_BLOCK, ModFoodProperties.TANSY);

    public static final DeferredItem<Item> ROZENBOTTEL = ITEMS.registerItem("rozenbottel",
            properties -> new RozenbottelItem(ModBlocks.ROZENBOTTEL_BLOCK.get(), properties),
            () -> new Item.Properties().food(ModFoodProperties.ROZENBOTTEL));

    public static final DeferredItem<Item> RUE = registerHerbFood("rue", ModBlocks.RUE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> SAGE = registerHerbFood("sage", ModBlocks.SAGE_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> TANSYFLOWERING = registerHerbFood("tansyflowering", ModBlocks.TANSYFLOWERING_BLOCK, ModFoodProperties.TANSYFLOWERING, ModFoodProperties.TANSYFLOWERING_CONSUMABLE);
    public static final DeferredItem<Item> THYME = registerHerbFood("thyme", ModBlocks.THYME_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> VALERIAN = registerHerbFood("valerian", ModBlocks.VALERIAN_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> WORMWOOD = registerHerbFood("wormwood", ModBlocks.WORMWOOD_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> YARROW = registerHerbFood("yarrow", ModBlocks.YARROW_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> DANDELIONBLOOM = registerHerbFood("dandelionbloom", ModBlocks.DANDELIONBLOOM_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> ELDER = registerHerbFood("elder", ModBlocks.ELDER_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> FENNEL = registerHerbFood("fennel", ModBlocks.FENNEL_BLOCK, ModFoodProperties.TANSY);
    public static final DeferredItem<Item> CHAMOMILE = registerHerbFood("chamomile", ModBlocks.CHAMOMILE_BLOCK, ModFoodProperties.CHAMOMILE, ModFoodProperties.CHAMOMILE_CONSUMABLE);

    public static final DeferredItem<Item> HOPS = ITEMS.registerItem("hops",
            properties -> new BlockItem(ModBlocks.HOPS_BLOCK.get(), properties),
            Item.Properties::new);

    public static final DeferredItem<Item> HOPS_SEED = ITEMS.registerItem("hops_seed",
            Item::new, Item.Properties::new);

    public static final DeferredItem<Item> CUP = ITEMS.registerItem("cup",
            CupItem::new, Item.Properties::new);

    public static final DeferredItem<Item> CUP_OF_WATER = ITEMS.registerItem("cup_of_water",
            CupOfWaterItem::new,
            () -> new Item.Properties().craftRemainder(ModItems.CUP.get()).stacksTo(1));

    public static final DeferredItem<Item> CHAMOMILE_TEA = ITEMS.registerItem("chamomile_tea",
            ChamomileTeaItem::new, Item.Properties::new);

    public static final DeferredItem<Item> MOROCCAN_MINT_TEA = ITEMS.registerItem("moroccan_mint_tea",
            MoroccanMintTeaItem::new, Item.Properties::new);

    public static final DeferredItem<Item> BEER = ITEMS.registerItem("beer",
            BeerItem::new, Item.Properties::new);

    public static final DeferredItem<Item> TANSY_PANCAKE = ITEMS.registerItem("tansy_pancake",
            Item::new,
            () -> new Item.Properties().food(ModFoodProperties.TANSY_PANCAKE, ModFoodProperties.TANSY_PANCAKE_CONSUMABLE));

    public static final DeferredItem<Item> CHAMOMILE_CAKE = ITEMS.registerItem("chamomile_cake",
            ChamomileCakeItem::new,
            () -> new Item.Properties().food(ModFoodProperties.CHAMOMILE_CAKE));

    public static final DeferredItem<Item> MINER_LUNG_CANDY = ITEMS.registerItem("miner_lung_candy",
            Item::new,
            () -> new Item.Properties().food(ModFoodProperties.MINER_LUNG_CANDY, ModFoodProperties.MINER_LUNG_CANDY_CONSUMABLE));

    public static final DeferredItem<Item> MUSIC_DISC_NOSTALGIA = ITEMS.registerItem("music_disc_nostalgia",
            Item::new,
            () -> new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(GatheringGrounds.MOD_ID, "nostalgia"))));

    private static DeferredItem<Item> registerHerbFood(String name, DeferredBlock<Block> block, FoodProperties food) {
        return registerHerbFood(name, block, food, Consumables.DEFAULT_FOOD);
    }

    private static DeferredItem<Item> registerHerbFood(String name, DeferredBlock<Block> block, FoodProperties food, Consumable consumable) {
        return ITEMS.registerItem(name,
                properties -> new BlockItem(block.get(), properties),
                () -> new Item.Properties().food(food, consumable));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
