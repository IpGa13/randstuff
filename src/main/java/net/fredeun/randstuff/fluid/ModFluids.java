package net.fredeun.randstuff.fluid;

import io.github.tropheusj.milk.MilkFluid;
import net.fredeun.randstuff.CreateRandomFunStuff;
import net.minecraft.fluid.EmptyFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    // Fluids are on hold right now because complex

    //public static final Fluid LIQUID_REDSTONE = registerFluid("liquid_redstone", new WaterFluid.Flowing());

    public static Fluid registerFluid(String name, Fluid fluid) {
        return Registry.register(Registries.FLUID, new Identifier(CreateRandomFunStuff.MOD_ID, name), fluid);
    }

    public static void registerModFluids() {
        CreateRandomFunStuff.LOGGER.info("Registering Fluids for Mod:" + CreateRandomFunStuff.MOD_ID);
    }
}
