package net.fredeun.randstuff.block;

import net.fredeun.randstuff.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.ItemSteerable;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class TeaLeavesBlock extends Block {
    public TeaLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public static void spawnLeaves(int amount, World world, BlockPos pos) {
        if (world.getBlockState(pos.up()) != Blocks.AIR.getDefaultState()) {
            return;
        }
        for (int i = 0; i < amount; i++) {
            world.spawnEntity(new ItemEntity(world, pos.getX(),pos.getY() +1,pos.getZ(), ModItems.TEA_LEAF.getDefaultStack()));
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        spawnLeaves(1,world,pos);
        if (random.nextBetween(1,15) < 13) {
            spawnLeaves(random.nextBetween(1,3),world,pos);
        }
        super.randomTick(state, world, pos, random);
    }
}
