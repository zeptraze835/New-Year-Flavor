package com.zeptraze.items;

import com.zeptraze.Registrar;
import com.zeptraze.blocks.BlockRegistrar;
import com.zeptraze.utils.items.*;
import com.zeptraze.utils.materials.NianArmorMaterial;
import com.zeptraze.utils.materials.NianToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.zeptraze.NewYearFlavor.MOD_ID;

public class ItemRegistrar extends Registrar {
    public static final Item NIAN_BEAST_SCRAP = new Item(new FabricItemSettings().fireproof());
    public static final Item NIAN_BEAST_SWORD = new SwordItem(NianToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_AXE = new CustomAxeItem(NianToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_PICKAXE = new CustomPickaxeItem(NianToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_HOE = new CustomHoeItem(NianToolMaterial.INSTANCE, -3, 0.0F, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_SHOVEL = new ShovelItem(NianToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_HELMET = new ArmorItem(NianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_CHESTPLATE = new ArmorItem(NianArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_LEGGINGS = new ArmorItem(NianArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_BOOTS = new ArmorItem(NianArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().fireproof());
    public static final Item NIAN_BEAST_INGOT = new Item(new FabricItemSettings().fireproof());
    public static final Item CANDLESTICK = new BlockItem(BlockRegistrar.CANDLESTICK, new FabricItemSettings().fireproof());
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_scrap"), NIAN_BEAST_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_ingot"), NIAN_BEAST_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_sword"), NIAN_BEAST_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_axe"), NIAN_BEAST_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_pickaxe"), NIAN_BEAST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_hoe"), NIAN_BEAST_HOE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_shovel"), NIAN_BEAST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_helmet"), NIAN_BEAST_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_chestplate"), NIAN_BEAST_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_leggings"), NIAN_BEAST_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nian_beast_boots"), NIAN_BEAST_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "candlestick"), CANDLESTICK);
    }
}
