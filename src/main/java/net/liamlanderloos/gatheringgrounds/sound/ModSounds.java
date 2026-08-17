package net.liamlanderloos.gatheringgrounds.sound;

import net.liamlanderloos.gatheringgrounds.GatheringGrounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, GatheringGrounds.MOD_ID);

    public static final Holder<SoundEvent> MUSIC_DISC_NOSTALGIA = SOUND_EVENTS.register("music_disc.nostalgia",
            () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(GatheringGrounds.MOD_ID, "music_disc.nostalgia")));

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
