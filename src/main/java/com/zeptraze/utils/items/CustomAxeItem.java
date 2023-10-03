package com.zeptraze.utils.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomAxeItem extends AxeItem {
    public CustomAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
