package net.liamlanderloos.gatheringgrounds.event;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.liamlanderloos.gatheringgrounds.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Moroccan Mint Tea only grants Luck II when two players drink it together: within 5 blocks of each other and within 5 seconds.
 * Drinking it alone (or too far apart / too late) does nothing.
 */
@EventBusSubscriber(modid = GatheringGrounds.MOD_ID)
public class MintPairEffectHandler {

    private static final double RADIUS = 5.0;
    private static final long WINDOW_TICKS = 100; // 5 seconds
    private static final int BUFF_DURATION_TICKS = 1200; // 1 minute

    private record MintEat(ResourceKey<Level> dimension, BlockPos pos, long gameTime) {
    }

    private static final Map<UUID, MintEat> RECENT_MINT_EATERS = new HashMap<>();

    @SubscribeEvent
    public static void onFinishUsingItem(LivingEntityUseItemEvent.Finish event) {
        if (!(event.getEntity() instanceof ServerPlayer player) || !event.getItem().is(ModItems.MOROCCAN_MINT_TEA.get())) {
            return;
        }

        Level level = player.level();
        long now = level.getGameTime();
        ResourceKey<Level> dimension = level.dimension();
        BlockPos pos = player.blockPosition();

        RECENT_MINT_EATERS.entrySet().removeIf(entry -> now - entry.getValue().gameTime() > WINDOW_TICKS);

        UUID partnerId = null;
        for (Map.Entry<UUID, MintEat> entry : RECENT_MINT_EATERS.entrySet()) {
            MintEat eat = entry.getValue();
            if (!entry.getKey().equals(player.getUUID())
                    && eat.dimension().equals(dimension)
                    && eat.pos().distSqr(pos) <= RADIUS * RADIUS) {
                partnerId = entry.getKey();
                break;
            }
        }

        if (partnerId != null) {
            RECENT_MINT_EATERS.remove(partnerId);
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, BUFF_DURATION_TICKS, 1));
            ServerPlayer partner = player.level().getServer().getPlayerList().getPlayer(partnerId);
            if (partner != null) {
                partner.addEffect(new MobEffectInstance(MobEffects.LUCK, BUFF_DURATION_TICKS, 1));
            }
        } else {
            RECENT_MINT_EATERS.put(player.getUUID(), new MintEat(dimension, pos, now));
        }
    }
}
