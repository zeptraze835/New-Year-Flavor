package com.zeptraze.blocks;

import com.zeptraze.Registrar;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.zeptraze.NewYearFlavor.MOD_ID;

public class BlockRegistrar extends Registrar {
    public static final Block CANDLESTICK = new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE_GRAY).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "candlestick"), CANDLESTICK);
    }
}
