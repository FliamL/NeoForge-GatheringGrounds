package net.liamlanderloos.moreflowers.block;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.custom.MarigoldBlock;
import net.liamlanderloos.moreflowers.block.custom.MudPotBlock;
import net.liamlanderloos.moreflowers.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MoreFlowers.MOD_ID);

    public static final List<DeferredBlock<Block>> CUTOUT_BLOCKS = new ArrayList<>();

    private static final BlockBehaviour.Properties HERB_PROPERTIES =
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY);

    public static final DeferredBlock<Block> TANSY_BLOCK = registerHerb("tansy");
    public static final DeferredBlock<Block> COMFREY_BLOCK = registerHerb("comfrey");
    public static final DeferredBlock<Block> HOREHOUND_BLOCK = registerHerb("horehound");
    public static final DeferredBlock<Block> HYSOP_BLOCK = registerHerb("hysop");
    public static final DeferredBlock<Block> LAVENDER_BLOCK = registerHerb("lavender");
    public static final DeferredBlock<Block> LOVAGE_BLOCK = registerHerb("lovage");
    public static final DeferredBlock<Block> MARIGOLD_BLOCK = registerCustomHerb("marigold",
            () -> new MarigoldBlock(MobEffects.REGENERATION, 5.0F, HERB_PROPERTIES));
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
            registerCutout("hops",
                    () -> new VineBlock(
                            BlockBehaviour.Properties.ofFullCopy(Blocks.VINE)
                    )
            );


    public static final DeferredBlock<Block> MUD_POT = registerBlock("mud_pot",
            () -> new MudPotBlock(BlockBehaviour.Properties.of()
                    .strength(0.0F)
                    .noOcclusion()
                    .sound(SoundType.GRASS)));

    private static DeferredBlock<Block> registerHerb(String name) {
        DeferredBlock<Block> block = BLOCKS.register(name, () ->
                new FlowerBlock(MobEffects.NIGHT_VISION, 5.0F, HERB_PROPERTIES)
        );
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static DeferredBlock<Block> registerCustomHerb(String name, Supplier<Block> supplier) {
        DeferredBlock<Block> block = BLOCKS.register(name, supplier);
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static DeferredBlock<Block> registerCutout(String name, Supplier<Block> supplier) {
        DeferredBlock<Block> block = BLOCKS.register(name, supplier);
        CUTOUT_BLOCKS.add(block);
        return block;
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> supplier) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, supplier);
        registerBlockitem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockitem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
