package com.eclipsense.astralexpanse.init;

import com.eclipsense.astralexpanse.AstralExpanse;
import com.eclipsense.astralexpanse.block.VoidiniumOreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AstralBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AstralExpanse.MODID);

    // Blocks for/from End
    public static final DeferredBlock<Block> END_STONE_VOIDINIUM_ORE = BLOCKS.registerBlock(
            "end_stone_voidinium_ore",
                    VoidiniumOreBlock::new,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .lightLevel((state) -> {return 7; })
                    .sound(SoundType.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> VOIDINIUM_BLOCK = BLOCKS.registerSimpleBlock(
            "voidinium_block",
            BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops());

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
