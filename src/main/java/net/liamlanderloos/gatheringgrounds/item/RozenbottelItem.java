package net.liamlanderloos.gatheringgrounds.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class RozenbottelItem extends BlockItem {
    private static final FoodProperties COLD_BIOME_FOOD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.25f)
            .build();

    public RozenbottelItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide() && livingEntity instanceof Player player) {
            BlockPos pos = livingEntity.blockPosition();
            Holder<Biome> biome = level.getBiome(pos);
            if (biome.value().coldEnoughToSnow(pos, level.getSeaLevel())) {
                player.getFoodData().eat(COLD_BIOME_FOOD);
                stack.consume(1, livingEntity);
                return stack;
            }
        }
        return super.finishUsingItem(stack, level, livingEntity);
    }
}
