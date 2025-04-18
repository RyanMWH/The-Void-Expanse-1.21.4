package com.eclipsense.astralexpanse.datagen.tags;

import com.eclipsense.astralexpanse.AstralExpanse;
import com.eclipsense.astralexpanse.init.AstralTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

// Not sure if I really need this because I only made one tag so far
// The tag I made was under the neoforge directory so not sure how to change
// my directory
public class BlockTagGen extends BlockTagsProvider {
    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, AstralExpanse.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(AstralTags.Blocks.NEEDS_VOIDINIUM_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(AstralTags.Blocks.INCORRECT_FOR_VOIDINIUM_TOOL)
                .remove(AstralTags.Blocks.NEEDS_VOIDINIUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
    }
}
