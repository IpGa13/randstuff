package net.fredeun.randstuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TeaSapling extends Block {
    public TeaSapling(Settings settings) {
        super(settings);
    }

    public int AGE;

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBlockState(pos.down()) == Blocks.GRASS_BLOCK.getDefaultState()){

            if (AGE >= 15) {
                world.setBlockState(pos.up(), ModBlocks.TEA_LEAVES.getDefaultState());
                world.setBlockState(pos, Blocks.OAK_LOG.getDefaultState());
            }


            AGE++;
            return;
        }
        TeaLeavesBlock.spawnLeaves(1,world,pos);
        world.removeBlock(pos,false);
    }
}
