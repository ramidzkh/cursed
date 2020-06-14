package cursed.entity;

import cursed.Cursed;
import cursed.entity.ww.WonderingWitherEntity;
import net.fabricmc.api.ModInitializer;
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
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build()
    );

    static void initialize(){}

}
