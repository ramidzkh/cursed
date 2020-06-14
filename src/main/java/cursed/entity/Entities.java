package cursed.entity;

import cursed.Cursed;
import cursed.entity.ww.WonderingWitherEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public interface Entities {

    EntityType<WonderingWitherEntity> WONDERING_WITHER = Registry.register(
            Registry.ENTITY_TYPE,
            Cursed.identifier("wondering_wither"),
            FabricEntityTypeBuilder
                    .create(SpawnGroup.MISC, WonderingWitherEntity::new)
                    .dimensions(EntityDimensions.fixed(4f, 4))
                    .build());

    static void initialize() {
        FabricDefaultAttributeRegistry.register(WONDERING_WITHER, WonderingWitherEntity.createMobAttributes());
    }

}
