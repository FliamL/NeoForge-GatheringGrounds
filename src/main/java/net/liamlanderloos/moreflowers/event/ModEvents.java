package net.liamlanderloos.moreflowers.event;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.item.ModItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = MoreFlowers.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event){
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addRecipe(
                Ingredient.of(ModItems.CUP_OF_WATER.get()),
                Ingredient.of(ModItems.CHAMOMILE.get()),
                new ItemStack(ModItems.CHAMOMILE_TEA.get())
        );

        builder.addRecipe(new IBrewingRecipe() {
            @Override
            public boolean isInput(ItemStack stack) {
                return stack.is(Items.POTION)
                        && stack.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(Potions.WATER);
            }

            @Override
            public boolean isIngredient(ItemStack stack) {
                return stack.is(ModItems.HOPS_SEED.get());
            }

            @Override
            public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
                return isInput(input) && isIngredient(ingredient) ? new ItemStack(ModItems.BEER.get()) : ItemStack.EMPTY;
            }
        });
    }
}
