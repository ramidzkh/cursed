package cursed.mixins;

import cursed.Cursed;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.state.StateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Frames have to be unlocked with withered fragments,
// gating the end until the player reached the withered biomes
@Mixin(EndPortalFrameBlock.class)
public class EndPortalFrameBlockMixin extends Block {

    public EndPortalFrameBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onInit(CallbackInfo callbackInfo) {
        setDefaultState(getDefaultState().with(Cursed.UNLOCKED, false));
    }

    @Inject(method = "appendProperties", at = @At("RETURN"))
    private void appendProperties(StateManager.Builder<Block, BlockState> builder, CallbackInfo callbackInfo) {
        builder.add(Cursed.UNLOCKED);
    }
}
