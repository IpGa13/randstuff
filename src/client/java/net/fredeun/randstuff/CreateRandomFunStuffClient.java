package net.fredeun.randstuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fredeun.randstuff.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class CreateRandomFunStuffClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEA_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEA_SAPLING, RenderLayer.getCutout());
	}
}