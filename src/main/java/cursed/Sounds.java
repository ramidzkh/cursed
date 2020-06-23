package cursed;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface Sounds {

    Identifier AMBIENT_ID = Cursed.identifier("ambient");
    SoundEvent AMBIENT_EVENT = new SoundEvent(AMBIENT_ID);

    static void initialize() {
        Registry.register(Registry.SOUND_EVENT, AMBIENT_ID, AMBIENT_EVENT);
    }
}
