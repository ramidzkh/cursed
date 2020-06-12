package cursed.item;

import cursed.Cursed;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WitheredFragmentItem extends Item {

    public WitheredFragmentItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);

        if (blockState.isOf(Blocks.END_PORTAL_FRAME) && !blockState.get(Cursed.UNLOCKED)) {
            if (world.isClient) {
                return ActionResult.SUCCESS;
            } else {
                context.getStack().decrement(1);
                world.setBlockState(blockPos, blockState.with(Cursed.UNLOCKED, true));
                return ActionResult.CONSUME;
            }
        }

        return ActionResult.PASS;
    }
}
