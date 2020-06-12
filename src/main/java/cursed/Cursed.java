package cursed;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Identifier;

public interface Cursed {

    BooleanProperty UNLOCKED = BooleanProperty.of("unlocked");

    static Identifier identifier(String path) {
        return new Identifier("cursed", path);
    }
}
