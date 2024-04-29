package net.fredeun.randstuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fredeun.randstuff.CreateRandomFunStuff;
import net.fredeun.randstuff.fluid.ModFluids;
import net.minecraft.item.Item;
import net.minecraft.item.PotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MARTINI_GLASS = registerItem("martini_glass", new Item(new FabricItemSettings()));
    public static final Item MOONSHINE = registerItem("moonshine", new Item(new FabricItemSettings()));

    public static final Item TEA_LEAF = registerItem("tea_leaf", new Item(new FabricItemSettings()));

    public static final Item ITS = registerItem("infertile_tea_sapling", new Item(new FabricItemSettings()));
    //public static final Item TS = registerItem("tea_sapling", new Item(new FabricItemSettings()));
    //public static final Item REDSTONE_BUCKET = registerItem("redstone_bucket", ModFluids.LIQUID_REDSTONE.getBucketItem());
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateRandomFunStuff.MOD_ID, name), item);
    }
    public static void registerModItems() {

        CreateRandomFunStuff.LOGGER.info("Registering Items for Mod: " + CreateRandomFunStuff.MOD_ID);
    }
}
