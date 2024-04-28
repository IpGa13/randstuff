package net.fredeun.randstuff;

import net.fabricmc.api.ModInitializer;

import net.fredeun.randstuff.block.ModBlocks;
import net.fredeun.randstuff.fluid.ModFluids;
import net.fredeun.randstuff.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateRandomFunStuff implements ModInitializer {
	public static final String MOD_ID = "randstuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModFluids.registerModFluids();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}