package net.liamlanderloos.moreflowers.event;

import net.liamlanderloos.moreflowers.effect.ModEffects;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;

import java.util.Set;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

public class PlayerDeathHandler {

    public static void register() {
        NeoForge.EVENT_BUS.register(PlayerDeathHandler.class);
    }

    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) return;

        if (!player.hasEffect(ModEffects.TANSY_EFFECT)) {
            return;
        }

        event.setCanceled(true);
        player.setHealth(player.getMaxHealth());

        MinecraftServer server = player.level().getServer();
        ServerPlayer.RespawnConfig respawnConfig = player.getRespawnConfig();
        BlockPos respawnPos = respawnConfig != null ? respawnConfig.respawnData().pos() : null;
        BlockPos fallbackPos = server.overworld().getLevelData().getRespawnData().pos();
        BlockPos targetPos = respawnPos != null ? respawnPos : fallbackPos;
        ResourceKey<Level> respawnDimension = ServerPlayer.RespawnConfig.getDimensionOrDefault(respawnConfig);

        player.teleportTo(
                server.getLevel(respawnDimension),
                targetPos.getX() + 0.5,
                targetPos.getY(),
                targetPos.getZ() + 0.5,
                Set.of(),
                player.getYRot(),
                player.getXRot(),
                true
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
        ServerLevel level = (ServerLevel) player.level();
        level.sendParticles(
                ParticleTypes.TOTEM_OF_UNDYING,
                player.getX(),
                player.getY() + 1.0,
                player.getZ(),
                100,           // particle count
                0.5, 1.0, 0.5, // spread X, Y, Z
                0.2            // speed
        );
        player.sendSystemMessage(
                Component.literal("The Tansy's blessing saves you from death!")
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.BOLD)
        );

        player.removeEffect(ModEffects.TANSY_EFFECT);
    }
}