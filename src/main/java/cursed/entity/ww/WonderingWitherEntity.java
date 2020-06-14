package cursed.entity.ww;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.world.World;

public class WonderingWitherEntity extends WitherEntity {

    public int stage = 1;

    public WonderingWitherEntity(EntityType<? extends WitherEntity> entityType, World world) {
        super(entityType, world);
    }
}
