package com.eclipsense.voidexpanse.init;

import com.eclipsense.voidexpanse.VoidExpanse;
import com.eclipsense.voidexpanse.armor.VoidSpecialArmor;
import com.eclipsense.voidexpanse.entity.VoidEntities;
import com.eclipsense.voidexpanse.item.GlintItem;
import com.eclipsense.voidexpanse.item.equipment.VoidArmorMaterials;
import com.eclipsense.voidexpanse.item.equipment.VoidToolTiers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.eclipsense.voidexpanse.init.ModBlocks.END_STONE_VOIDINIUM_ORE;
import static com.eclipsense.voidexpanse.init.ModBlocks.VOIDINIUM_BLOCK;

public class ModItems {
    //public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, VoidExpanse.MODID);

    //public static final DeferredHolder<Item, Item> OUTPOST_MAP = ITEMS.register("outpost_map", () -> new Item(new Item.Properties()));


    // Items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VoidExpanse.MODID);

    // Items for/from End
    public static final DeferredItem<Item> VOIDINIUM_SHARD = ITEMS.registerItem("voidinium_shard",
            properties -> new Item(properties));
    public static final DeferredItem<Item> CONCENTRATED_VOIDINIUM = ITEMS.registerItem("concentrated_voidinium",
            properties -> new GlintItem(properties));
    public static final DeferredItem<Item> VOIDINIUM_INGOT = ITEMS.registerItem("voidinium_ingot",
            properties -> new Item(properties));
    public static final DeferredItem<Item> VOID_INFUSED_HEART = ITEMS.registerItem("void_infused_heart",
            properties -> new GlintItem(properties.fireResistant().stacksTo(16)));
    public static final DeferredItem<Item> VOID_FRAGMENT = ITEMS.registerItem("void_fragment",
            properties -> new GlintItem(properties.fireResistant().stacksTo(16)));

    // Voidinium Tools
    public static final DeferredItem<SwordItem> VOIDINIUM_SWORD = ITEMS.registerItem("voidinium_sword",
            properties -> new SwordItem(VoidToolTiers.VOIDINIUM, 3.5F, -2.2F, properties),
            new Item.Properties());
    public static final DeferredItem<ShovelItem> VOIDINIUM_SHOVEL = ITEMS.registerItem("voidinium_shovel",
            properties -> new ShovelItem(VoidToolTiers.VOIDINIUM, 2.0F, -3.5F, properties),
            new Item.Properties());
    public static final DeferredItem<PickaxeItem> VOIDINIUM_PICKAXE = ITEMS.registerItem("voidinium_pickaxe",
            properties -> new PickaxeItem(VoidToolTiers.VOIDINIUM, 1.0F, -3.0F, properties),
            new Item.Properties());
    public static final DeferredItem<AxeItem> VOIDINIUM_AXE = ITEMS.registerItem("voidinium_axe",
            properties -> new AxeItem(VoidToolTiers.VOIDINIUM, 5.0F, -3.2F, properties),
            new Item.Properties());
    public static final DeferredItem<HoeItem> VOIDINIUM_HOE = ITEMS.registerItem("voidinium_hoe",
            properties -> new HoeItem(VoidToolTiers.VOIDINIUM, -4.0F, 0.0F, properties),
            new Item.Properties());

    // Voidinium Armor
    public static final DeferredItem<VoidSpecialArmor> VOIDINIUM_HELMET = ITEMS.registerItem("voidinium_helmet",
            properties -> new VoidSpecialArmor(VoidArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.HELMET,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_CHESTPLATE = ITEMS.registerItem("voidinium_chestplate",
            properties -> new ArmorItem(VoidArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_LEGGINGS = ITEMS.registerItem("voidinium_leggings",
            properties -> new ArmorItem(VoidArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_BOOTS = ITEMS.registerItem("voidinium_boots",
            properties -> new ArmorItem(VoidArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.BOOTS,
                    properties));

    // Block items
    public static final DeferredItem<BlockItem> END_STONE_VOIDINIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem(
            "end_stone_voidinium_ore",
            END_STONE_VOIDINIUM_ORE);
    public static final DeferredItem<BlockItem> VOIDINIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "voidinium_block",
            VOIDINIUM_BLOCK);

    // Spawn eggs
    public static final DeferredItem<SpawnEggItem> ENDER_WISP_SPAWN_EGG = ITEMS.registerItem("ender_wisp_spawn_egg",
            properties -> new SpawnEggItem(VoidEntities.ENDER_WISP.get(), properties));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
