package com.zeptraze.utils.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static com.zeptraze.items.ItemRegistrar.NIAN_BEAST_SCRAP;

public class NianToolMaterial implements ToolMaterial {
    public static final NianToolMaterial INSTANCE = new NianToolMaterial();
    @Override
    public int getDurability() {
        return 620;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(NIAN_BEAST_SCRAP);
    }
}
