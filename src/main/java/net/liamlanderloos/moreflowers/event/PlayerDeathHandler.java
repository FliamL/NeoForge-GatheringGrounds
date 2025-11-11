package net.liamlanderloos.moreflowers.event;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.common.NeoForge;

public class PlayerDeathHandler {

    public static void register() {
        NeoForge.EVENT_BUS.register(PlayerDeathHandler.class);
    }

    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) return;

        if (!player.hasEffect(ModEffects.TANSY_EFFECT)) {
            return ;
        }

        player.level().playSound(
                null, // null means play for all nearby players
                player.getX(),
                player.getY(),
                player.getZ(),
                net.minecraft.sounds.SoundEvents.TOTEM_USE,
                net.minecraft.sounds.SoundSource.PLAYERS,
                0.5F,
                1.0F
        );

        event.setCanceled(true);
        player.setHealth(player.getMaxHealth());

        player.teleportTo(
                player.server.getLevel(player.getRespawnDimension()),
                player.getRespawnPosition() != null
                        ? player.getRespawnPosition().getX() + 0.5 : player.server.overworld().getSharedSpawnPos().getX() + 0.5,
                player.getRespawnPosition() != null
                        ? player.getRespawnPosition().getY() : player.server.overworld().getSharedSpawnPos().getY(),
                player.getRespawnPosition() != null
                        ? player.getRespawnPosition().getZ() + 0.5 : player.server.overworld().getSharedSpawnPos().getZ() + 0.5,
                player.getYRot(),
                player.getXRot()
        );

        Holder<SoundEvent> totemSound = BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.TOTEM_USE);

        player.connection.send(new ClientboundSoundPacket(
                totemSound,
                SoundSource.PLAYERS,
                player.getX(),
                player.getY(),
                player.getZ(),
                0.5F,
                1.0F,
                1
        ));

        player.sendSystemMessage(
                Component.literal("The Tansy's blessing saves you from death!")
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.BOLD)
        );

        player.removeEffect(ModEffects.TANSY_EFFECT);

    }
}