package net.liamlanderloos.gatheringgrounds.worldgen;

import com.mojang.serialization.Codec;
import net.liamlanderloos.gatheringgrounds.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Mirrors vanilla's {@code VinesFeature}, but attaches Hops instead of plain Vine,
 * so hops can climb tree trunks in forest/riverbank biomes like the real plant does.
 */
public class HopsVinesFeature extends Feature<NoneFeatureConfiguration> {
    public HopsVinesFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        context.config();
        if (!level.isEmptyBlock(origin)) {
            return false;
        }

        for (Direction direction : Direction.values()) {
            if (direction != Direction.DOWN && VineBlock.isAcceptableNeighbour(level, origin.relative(direction), direction)) {
                level.setBlock(origin, ModBlocks.HOPS_BLOCK.get().defaultBlockState().setValue(VineBlock.getPropertyForFace(direction), true), 2);
                return true;
            }
        }

        return false;
    }
}
