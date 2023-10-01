package com.zeptraze;

import com.zeptraze.blocks.BlockRegistrar;
import com.zeptraze.items.ItemRegistrar;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.zeptraze.NewYearFlavor.MOD_ID;
import static com.zeptraze.items.ItemRegistrar.NIAN_BEAST_SCRAP;

public abstract class Registrar {
    public static final ItemGroup NEW_YEAR_FLAVOR = FabricItemGroupBuilder
            .create(new Identifier(MOD_ID, "new_year_flavor"))
            .icon(NIAN_BEAST_SCRAP::getDefaultStack)
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(NIAN_BEAST_SCRAP));
            })
            .build();
    public static void register() {
        ItemRegistrar.register();
        BlockRegistrar.register();
    }
}
