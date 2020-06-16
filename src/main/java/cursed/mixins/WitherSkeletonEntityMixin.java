package cursed.mixins;

import cursed.biome.Biomes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkeletonEntity.class)
public abstract class WitherSkeletonEntityMixin extends AbstractSkeletonEntity {

    protected WitherSkeletonEntityMixin(EntityType<? extends AbstractSkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    private ItemStack randomChestplate() {
        if (random.nextBoolean()) return new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1);
        return new ItemStack(Items.LEATHER_CHESTPLATE, 1);
    }

    @Inject(method = "initEquipment", at = @At("TAIL"))
    public void initEquipment(LocalDifficulty difficulty, CallbackInfo callbackInfo) {
        if (difficulty.getGlobalDifficulty().getId() > Difficulty.EASY.getId()) {
            equipStack(EquipmentSlot.CHEST, randomChestplate());
            equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD, 1));
            if (random.nextFloat() > 0.2 && world.getBiome(new BlockPos(getPos())) == Biomes.WITHERED_WASTELAND)
                equipStack(EquipmentSlot.OFFHAND, new ItemStack(cursed.item.Items.WITHERED_FRAGMENT, 1));
            if (random.nextFloat() > 0.9) setCustomName(new LiteralText("tiny potato"));
            if (random.nextFloat() > 0.9) setCustomName(new LiteralText("noble defender"));
        }
    }

}
