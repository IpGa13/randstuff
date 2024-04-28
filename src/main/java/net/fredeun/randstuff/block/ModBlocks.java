package net.fredeun.randstuff.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fredeun.randstuff.CreateRandomFunStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).lightLevel(10)));

    public static final Block GROUND_BASALT = registerBlock("ground_basalt", new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL)));

    private static Block registerBlock(String name, Block block) {
        Identifier id = new Identifier(CreateRandomFunStuff.MOD_ID, name);
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static void registerBlockItem(Identifier identifier, Block block) {
        Registry.register(Registries.ITEM, identifier, new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CreateRandomFunStuff.LOGGER.info("Registering Blocks for Mod: " + CreateRandomFunStuff.MOD_ID);
    }
}
