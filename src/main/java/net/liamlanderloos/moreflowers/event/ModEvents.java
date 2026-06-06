package net.liamlanderloos.moreflowers.event;

import net.liamlanderloos.moreflowers.MoreFlowers;
import net.liamlanderloos.moreflowers.item.ModItems;
import net.liamlanderloos.moreflowers.potion.ModPotions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = MoreFlowers.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event){
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(ModPotions.CUP_OF_WATER_POTION, ModItems.CHAMOMILE.get(), ModPotions.CHAMOMILE_TEA_POTION);
    }
}
