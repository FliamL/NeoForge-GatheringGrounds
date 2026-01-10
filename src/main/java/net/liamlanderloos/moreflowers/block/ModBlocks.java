package net.liamlanderloos.moreflowers.block;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.block.custom.MudPotBlock;
import net.liamlanderloos.moreflowers.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MoreFlowers.MOD_ID);

    public static final DeferredBlock<Block> TANSY_BLOCK = BLOCKS.register("tansy",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> COMFREY_BLOCK = BLOCKS.register("comfrey",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> HOREHOUND_BLOCK = BLOCKS.register("horehound",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> HYSOP_BLOCK = BLOCKS.register("hysop",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> LAVENDER_BLOCK = BLOCKS.register("lavender",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> LOVAGE_BLOCK = BLOCKS.register("lovage",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> MARIGOLD_BLOCK = BLOCKS.register("marigold",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> MINT_BLOCK = BLOCKS.register("mint",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> NETTLE_BLOCK = BLOCKS.register("nettle",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> PEPPERMINT_BLOCK = BLOCKS.register("peppermint",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> PLANTAIN_BLOCK = BLOCKS.register("plantain",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> ROSEMARY_BLOCK = BLOCKS.register("rosemary",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> ROZENBOTTEL_BLOCK = BLOCKS.register("rozenbottel",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> RUE_BLOCK = BLOCKS.register("rue",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> SAGE_BLOCK = BLOCKS.register("sage",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> TANSYFLOWERING_BLOCK = BLOCKS.register("tansyflowering",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> THYME_BLOCK = BLOCKS.register("thyme",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> VALERIAN_BLOCK = BLOCKS.register("valerian",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> WORMWOOD_BLOCK = BLOCKS.register("wormwood",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> YARROW_BLOCK = BLOCKS.register("yarrow",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> DANDELIONBOOM_BLOCK = BLOCKS.register("dandelionbloom",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> ELDER_BLOCK = BLOCKS.register("elder",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> FENNER_BLOCK = BLOCKS.register("fennel",
            () -> new FlowerBlock(
                    MobEffects.NIGHT_VISION,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)

            ));

    public static final DeferredBlock<Block> HOPS_BLOCK = BLOCKS.register("hops",
            () -> new VineBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.VINE)
            )
    );


    public static final DeferredBlock<Block> MUD_POT = registerBlock("mud_pot",
            () -> new MudPotBlock(BlockBehaviour.Properties.of()
                    .strength(0.0F)
                    .noOcclusion()
                    .sound(SoundType.GRASS)));


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
