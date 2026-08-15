package net.liamlanderloos.gatheringgrounds.block;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.liamlanderloos.gatheringgrounds.block.custom.MarigoldBlock;
import net.liamlanderloos.gatheringgrounds.block.custom.MudPotBlock;
import net.liamlanderloos.gatheringgrounds.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(GatheringGrounds.MOD_ID);

    public static final List<DeferredBlock<Block>> CUTOUT_BLOCKS = new ArrayList<>();

    private static BlockBehaviour.Properties herbProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollision()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY);
    }

    public static final DeferredBlock<Block> TANSY_BLOCK = registerHerb("tansy");
    public static final DeferredBlock<Block> COMFREY_BLOCK = registerHerb("comfrey");
    public static final DeferredBlock<Block> HOREHOUND_BLOCK = registerHerb("horehound");
    public static final DeferredBlock<Block> HYSOP_BLOCK = registerHerb("hysop");
    public static final DeferredBlock<Block> LAVENDER_BLOCK = registerHerb("lavender");
    public static final DeferredBlock<Block> LOVAGE_BLOCK = registerHerb("lovage");
    public static final DeferredBlock<Block> MARIGOLD_BLOCK = registerCustomHerb("marigold",
            properties -> new MarigoldBlock(MobEffects.REGENERATION, 5.0F, properties));
    public static final DeferredBlock<Block> MINT_BLOCK = registerHerb("mint");
    public static final DeferredBlock<Block> NETTLE_BLOCK = registerHerb("nettle");
    public static final DeferredBlock<Block> PEPPERMINT_BLOCK = registerHerb("peppermint");
    public static final DeferredBlock<Block> PLANTAIN_BLOCK = registerHerb("plantain");
    public static final DeferredBlock<Block> ROSEMARY_BLOCK = registerHerb("rosemary");
    public static final DeferredBlock<Block> ROZENBOTTEL_BLOCK = registerHerb("rozenbottel");
    public static final DeferredBlock<Block> RUE_BLOCK = registerHerb("rue");
    public static final DeferredBlock<Block> SAGE_BLOCK = registerHerb("sage");
    public static final DeferredBlock<Block> TANSYFLOWERING_BLOCK = registerHerb("tansyflowering");
    public static final DeferredBlock<Block> THYME_BLOCK = registerHerb("thyme");
    public static final DeferredBlock<Block> VALERIAN_BLOCK = registerHerb("valerian");
    public static final DeferredBlock<Block> WORMWOOD_BLOCK = registerHerb("wormwood");
    public static final DeferredBlock<Block> YARROW_BLOCK = registerHerb("yarrow");
    public static final DeferredBlock<Block> DANDELIONBLOOM_BLOCK = registerHerb("dandelionbloom");
    public static final DeferredBlock<Block> ELDER_BLOCK = registerHerb("elder");
    public static final DeferredBlock<Block> FENNEL_BLOCK = registerHerb("fennel");
    public static final DeferredBlock<Block> CHAMOMILE_BLOCK = registerHerb("chamomile");

    public static final DeferredBlock<Block> HOPS_BLOCK =
            registerCutout("hops", VineBlock::new,
                    () -> BlockBehaviour.Properties.ofFullCopy(Blocks.VINE));


    public static final DeferredBlock<Block> MUD_POT = registerBlock("mud_pot", MudPotBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .strength(0.0F)
                    .noOcclusion()
                    .sound(SoundType.GRASS));

    private static final Map<String, DeferredBlock<Block>> POTTABLE_FLOWERS = new LinkedHashMap<>();
    public static final Map<String, DeferredBlock<Block>> POTTED_BLOCKS = new LinkedHashMap<>();

    static {
        POTTABLE_FLOWERS.put("tansy", TANSY_BLOCK);
        POTTABLE_FLOWERS.put("comfrey", COMFREY_BLOCK);
        POTTABLE_FLOWERS.put("horehound", HOREHOUND_BLOCK);
        POTTABLE_FLOWERS.put("hysop", HYSOP_BLOCK);
        POTTABLE_FLOWERS.put("lavender", LAVENDER_BLOCK);
        POTTABLE_FLOWERS.put("lovage", LOVAGE_BLOCK);
        POTTABLE_FLOWERS.put("marigold", MARIGOLD_BLOCK);
        POTTABLE_FLOWERS.put("mint", MINT_BLOCK);
        POTTABLE_FLOWERS.put("nettle", NETTLE_BLOCK);
        POTTABLE_FLOWERS.put("peppermint", PEPPERMINT_BLOCK);
        POTTABLE_FLOWERS.put("plantain", PLANTAIN_BLOCK);
        POTTABLE_FLOWERS.put("rosemary", ROSEMARY_BLOCK);
        POTTABLE_FLOWERS.put("rozenbottel", ROZENBOTTEL_BLOCK);
        POTTABLE_FLOWERS.put("rue", RUE_BLOCK);
        POTTABLE_FLOWERS.put("sage", SAGE_BLOCK);
        POTTABLE_FLOWERS.put("tansyflowering", TANSYFLOWERING_BLOCK);
        POTTABLE_FLOWERS.put("thyme", THYME_BLOCK);
        POTTABLE_FLOWERS.put("valerian", VALERIAN_BLOCK);
        POTTABLE_FLOWERS.put("wormwood", WORMWOOD_BLOCK);
        POTTABLE_FLOWERS.put("yarrow", YARROW_BLOCK);
        POTTABLE_FLOWERS.put("dandelionbloom", DANDELIONBLOOM_BLOCK);
        POTTABLE_FLOWERS.put("elder", ELDER_BLOCK);
        POTTABLE_FLOWERS.put("fennel", FENNEL_BLOCK);
        POTTABLE_FLOWERS.put("chamomile", CHAMOMILE_BLOCK);

        POTTABLE_FLOWERS.forEach((name, block) -> POTTED_BLOCKS.put(name, registerFlowerPot(name, block)));
    }

    private static DeferredBlock<Block> registerFlowerPot(String name, DeferredBlock<Block> content) {
        return BLOCKS.registerBlock("potted_" + name,
                properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, content, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION));
    }

    private static DeferredBlock<Block> registerHerb(String name) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name,
                properties -> new FlowerBlock(MobEffects.NIGHT_VISION, 5.0F, properties),
                ModBlocks::herbProperties);
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static DeferredBlock<Block> registerCustomHerb(String name, Function<BlockBehaviour.Properties, Block> factory) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, factory, ModBlocks::herbProperties);
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static DeferredBlock<Block> registerCutout(String name, Function<BlockBehaviour.Properties, Block> factory, Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<Block> block = BLOCKS.registerBlock(name, factory, properties);
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> factory, Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, factory, properties);
        registerBlockitem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockitem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties), Item.Properties::new);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> POTTED_BLOCKS.forEach((name, potted) -> {
            Identifier flowerId = BuiltInRegistries.BLOCK.getKey(POTTABLE_FLOWERS.get(name).get());
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(flowerId, potted);
        }));
    }
}
