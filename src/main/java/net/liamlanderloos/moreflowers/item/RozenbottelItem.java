package net.liamlanderloos.moreflowers.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class RozenbottelItem extends BlockItem {
    private static final FoodProperties COLD_BIOME_FOOD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.25f)
            .build();

    public RozenbottelItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public FoodProperties getFoodProperties(ItemStack stack, @Nullable LivingEntity entity) {
        if (entity != null) {
            Level level = entity.level();
            BlockPos pos = entity.blockPosition();
            Holder<Biome> biome = level.getBiome(pos);
            if (biome.value().coldEnoughToSnow(pos)) {
                return COLD_BIOME_FOOD;
            }
        }
        return super.getFoodProperties(stack, entity);
    }
}
