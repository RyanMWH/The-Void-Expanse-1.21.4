package com.eclipsense.voidexpanse.datagen.models;

import com.eclipsense.voidexpanse.init.ModItems;
import com.eclipsense.voidexpanse.item.equipment.VoidEquipmentAssets;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {


    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
        System.out.println("ItemModelGen constructor called!");
    }

    @Override
    public void run() {
        // Item Item Models
        this.generateFlatItem(ModItems.VOID_INFUSED_HEART.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.VOID_FRAGMENT.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_SHARD.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CONCENTRATED_VOIDINIUM.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.VOIDINIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateTrimmableItem(ModItems.VOIDINIUM_HELMET.get(), VoidEquipmentAssets.VOIDINIUM, "helment", false);
        this.generateTrimmableItem(ModItems.VOIDINIUM_CHESTPLATE.get(), VoidEquipmentAssets.VOIDINIUM, "chestplate", false);
        this.generateTrimmableItem(ModItems.VOIDINIUM_LEGGINGS.get(), VoidEquipmentAssets.VOIDINIUM, "leggings", false);
        this.generateTrimmableItem(ModItems.VOIDINIUM_BOOTS.get(), VoidEquipmentAssets.VOIDINIUM, "boots", false);
        this.generateSpawnEgg(ModItems.ENDER_WISP_SPAWN_EGG.get(), 1447446, 14711290);
    }
}
