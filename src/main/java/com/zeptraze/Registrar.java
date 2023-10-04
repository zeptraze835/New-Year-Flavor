package com.zeptraze;

import com.zeptraze.blocks.BlockRegistrar;
import com.zeptraze.items.ItemRegistrar;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.zeptraze.NewYearFlavor.MOD_ID;
import static com.zeptraze.items.ItemRegistrar.*;

public class Registrar {
    public static final ItemGroup NEW_YEAR_FLAVOR = FabricItemGroupBuilder
            .create(new Identifier(MOD_ID, "new_year_flavor"))
            .icon(NIAN_BEAST_SCRAP::getDefaultStack)
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(NIAN_BEAST_SCRAP));
                itemStacks.add(new ItemStack(NIAN_BEAST_INGOT));
                itemStacks.add(new ItemStack(NIAN_BEAST_SWORD));
                itemStacks.add(new ItemStack(NIAN_BEAST_AXE));
                itemStacks.add(new ItemStack(NIAN_BEAST_PICKAXE));
                itemStacks.add(new ItemStack(NIAN_BEAST_HOE));
                itemStacks.add(new ItemStack(NIAN_BEAST_SHOVEL));
                itemStacks.add(new ItemStack(NIAN_BEAST_HELMET));
                itemStacks.add(new ItemStack(NIAN_BEAST_CHESTPLATE));
                itemStacks.add(new ItemStack(NIAN_BEAST_LEGGINGS));
                itemStacks.add(new ItemStack(NIAN_BEAST_BOOTS));
                // itemStacks.add(new ItemStack(CANDLESTICK));
            })
            .build();
    public static void register() {
        ItemRegistrar.register();
        BlockRegistrar.register();
    }
}
