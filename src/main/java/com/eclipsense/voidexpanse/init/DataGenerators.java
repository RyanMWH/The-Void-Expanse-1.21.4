package com.eclipsense.voidexpanse.init;


import com.eclipsense.voidexpanse.VoidExpanse;
import com.eclipsense.voidexpanse.datagen.data.DataPackGen;
import com.eclipsense.voidexpanse.datagen.loot.LootTableGen;
import com.eclipsense.voidexpanse.datagen.models.ModelGen;
import com.eclipsense.voidexpanse.datagen.recipes.RecipeGen;
import com.eclipsense.voidexpanse.datagen.tags.BlockTagGen;
import com.eclipsense.voidexpanse.datagen.tags.ItemTagGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;


import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = VoidExpanse.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        // ExistingFileHelper doesn't seem to be used anymore...
        //ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        // After some research it seems to be true that this is no longer used.

        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();


        // Create and call provider/generators
        generator.addProvider(true,
                new LootTableProvider(packOutput,
                        Collections.emptySet(),
                        List.of(new LootTableProvider.SubProviderEntry(LootTableGen::new,
                                LootContextParamSets.BLOCK))
                ,lookupProvider));

        generator.addProvider(true,
                new ModelGen(packOutput));

        generator.addProvider(true,
                new DataPackGen(packOutput, lookupProvider));

        event.createProvider(RecipeGen.Runner::new);

        BlockTagsProvider blockTagsProvider = new BlockTagGen(packOutput, lookupProvider);

        generator.addProvider(true,
                blockTagsProvider);

        generator.addProvider(true,
                new ItemTagGen(packOutput, lookupProvider, blockTagsProvider.contentsGetter()));
    }
}
