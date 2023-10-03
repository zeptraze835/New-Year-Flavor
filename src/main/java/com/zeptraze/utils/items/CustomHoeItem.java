package com.zeptraze.utils.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoeItem extends HoeItem {
    public CustomHoeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
