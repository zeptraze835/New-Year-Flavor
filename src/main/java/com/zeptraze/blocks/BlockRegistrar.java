package com.zeptraze.blocks;

import com.zeptraze.Registrar;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import static com.zeptraze.NewYearFlavor.MOD_ID;

public class BlockRegistrar extends Registrar {
    public static final Block CANDLESTICK = new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE_GRAY).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block COUPLETS = new ShapeBlock(FabricBlockSettings.of(Material.WOOL, MapColor.BRIGHT_RED).strength(0.8F).sounds(BlockSoundGroup.WOOL).noCollision(), VoxelShapes.cuboid(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F));
    public static final Block RED_RIBBON = new ShapeBlock(FabricBlockSettings.of(Material.WOOL, MapColor.RED).strength(0.8F).sounds(BlockSoundGroup.WOOL).noCollision(), VoxelShapes.cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F));
    public static final Block GOLD_RIBBON = new ShapeBlock(FabricBlockSettings.of(Material.WOOL, MapColor.GOLD).strength(0.8F).sounds(BlockSoundGroup.WOOL).noCollision(), VoxelShapes.cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F));
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "candlestick"), CANDLESTICK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "couplets"), COUPLETS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "red_ribbon"), RED_RIBBON);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gold_ribbon"), GOLD_RIBBON);
    }
}
