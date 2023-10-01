package com.zeptraze.items;

import com.zeptraze.Registrar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.zeptraze.NewYearFlavor.MOD_ID;

public class ItemRegistrar extends Registrar {
    public static final Item NIAN_BEAST_SCRAP = new Item(new FabricItemSettings());
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_scrap"), NIAN_BEAST_SCRAP);
    }
}
