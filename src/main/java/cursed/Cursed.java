package cursed;

import cursed.entity.ww.WonderingWitherEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface Cursed {

    BooleanProperty UNLOCKED = BooleanProperty.of("unlocked");

    static Identifier identifier(String path) {
        return new Identifier("cursed", path);
    }
}
