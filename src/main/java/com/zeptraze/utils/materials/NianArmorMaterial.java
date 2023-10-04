package com.zeptraze.utils.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static com.zeptraze.items.ItemRegistrar.NIAN_BEAST_SCRAP;

public class NianArmorMaterial implements ArmorMaterial {
    public static final NianArmorMaterial INSTANCE = new NianArmorMaterial();
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{3, 6, 7, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 24;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(NIAN_BEAST_SCRAP);
    }

    @Override
    public String getName() {
        return "nian_beast";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
