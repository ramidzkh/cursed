package cursed.mixins;

import cursed.Cursed;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.item.EnderEyeItem;
import net.minecraft.state.property.Property;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

// See EndPortalFrameBlockMixin
@Mixin(EnderEyeItem.class)
public class EnderEyeItemMixin {

    @Redirect(method = "useOnBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;get(Lnet/minecraft/state/property/Property;)Ljava/lang/Comparable;"))
    private Comparable get(BlockState blockState, Property property) {
        if (property == EndPortalFrameBlock.EYE) {
            return !blockState.get(Cursed.UNLOCKED) || blockState.get(EndPortalFrameBlock.EYE);
        }

        return blockState.get(property);
    }
}
