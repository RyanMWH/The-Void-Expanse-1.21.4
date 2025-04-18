package com.eclipsense.astralexpanse.init;

import com.eclipsense.astralexpanse.AstralExpanse;
import com.eclipsense.astralexpanse.armor.VoidiniumSpecialArmor;
import com.eclipsense.astralexpanse.item.GlintItem;
import com.eclipsense.astralexpanse.item.equipment.AstralArmorMaterials;
import com.eclipsense.astralexpanse.item.equipment.AstralToolTiers;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.eclipsense.astralexpanse.init.AstralBlocks.END_STONE_VOIDINIUM_ORE;
import static com.eclipsense.astralexpanse.init.AstralBlocks.VOIDINIUM_BLOCK;

public class AstralItems {


    // Items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AstralExpanse.MODID);

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
    public static final DeferredItem<Item> ENDER_DUST = ITEMS.registerItem("ender_dust",
            properties -> new Item(properties));

    // Voidinium Tools
    public static final DeferredItem<SwordItem> VOIDINIUM_SWORD = ITEMS.registerItem("voidinium_sword",
            properties -> new SwordItem(AstralToolTiers.VOIDINIUM, 3.5F, -2.2F, properties),
            new Item.Properties());
    public static final DeferredItem<ShovelItem> VOIDINIUM_SHOVEL = ITEMS.registerItem("voidinium_shovel",
            properties -> new ShovelItem(AstralToolTiers.VOIDINIUM, 2.0F, -3.5F, properties),
            new Item.Properties());
    public static final DeferredItem<PickaxeItem> VOIDINIUM_PICKAXE = ITEMS.registerItem("voidinium_pickaxe",
            properties -> new PickaxeItem(AstralToolTiers.VOIDINIUM, 1.0F, -3.0F, properties),
            new Item.Properties());
    public static final DeferredItem<AxeItem> VOIDINIUM_AXE = ITEMS.registerItem("voidinium_axe",
            properties -> new AxeItem(AstralToolTiers.VOIDINIUM, 5.0F, -3.2F, properties),
            new Item.Properties());
    public static final DeferredItem<HoeItem> VOIDINIUM_HOE = ITEMS.registerItem("voidinium_hoe",
            properties -> new HoeItem(AstralToolTiers.VOIDINIUM, -4.0F, 0.0F, properties),
            new Item.Properties());

    // Voidinium Armor
    public static final DeferredItem<VoidiniumSpecialArmor> VOIDINIUM_HELMET = ITEMS.registerItem("voidinium_helmet",
            properties -> new VoidiniumSpecialArmor(AstralArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.HELMET,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_CHESTPLATE = ITEMS.registerItem("voidinium_chestplate",
            properties -> new ArmorItem(AstralArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_LEGGINGS = ITEMS.registerItem("voidinium_leggings",
            properties -> new ArmorItem(AstralArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
                    properties));
    public static final DeferredItem<ArmorItem> VOIDINIUM_BOOTS = ITEMS.registerItem("voidinium_boots",
            properties -> new ArmorItem(AstralArmorMaterials.VOIDINIUM_ARMOR_MATERIAL, ArmorType.BOOTS,
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
            properties -> new SpawnEggItem(AstralEntities.ENDER_WISP.get(), properties));

    public static final DeferredItem<SpawnEggItem> VOID_PROWLER_SPAWN_EGG = ITEMS.registerItem("void_prowler_spawn_egg",
        properties -> new SpawnEggItem(AstralEntities.VOID_PROWLER.get(), properties));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
