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

    EntityType<WonderingWitherEntity> WONDERING_WITHER = Registry.register(
            Registry.ENTITY_TYPE,
            identifier("wondering_wither"),
            FabricEntityTypeBuilder
                    .create(SpawnGroup.MISC, WonderingWitherEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build()
    );

    static Identifier identifier(String path) {
        return new Identifier("cursed", path);
    }
}
