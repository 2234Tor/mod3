package com.topraktunca.element.util;

import com.topraktunca.element.armor.ModArmorMaterial;
import com.topraktunca.element.blocks.BlockItemBase;
import com.topraktunca.element.blocks.TOre;
import com.topraktunca.element.blocks.TOreBlock;
import com.topraktunca.element.element_t;
import com.topraktunca.element.items.ItemBase;
import com.topraktunca.element.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, element_t.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, element_t.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static final RegistryObject<Item>  ELEMENT_T = ITEMS.register("element_t", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> T_SWORD = ITEMS.register("t_sword", () ->
            new SwordItem(ModItemTier.ELEMENT_T, 25, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<PickaxeItem> T_PICKAXE = ITEMS.register("t_pickaxe", () ->
            new PickaxeItem(ModItemTier.ELEMENT_T, 10, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<AxeItem> T_AXE = ITEMS.register("t_axe", () ->
            new AxeItem(ModItemTier.ELEMENT_T, 35, -2.8F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ShovelItem> T_SHOVEL = ITEMS.register("t_shovel", () ->
            new ShovelItem(ModItemTier.ELEMENT_T, 5, -2.1F, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<HoeItem> T_HOE = ITEMS.register("t_hoe", () ->
            new HoeItem(ModItemTier.ELEMENT_T, -1.0F, new Item.Properties().group(element_t.TAB)));

    //Armors
    public static final RegistryObject<ArmorItem> T_HELMET = ITEMS.register("t_helmet", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.HEAD, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_CHESTPLATE = ITEMS.register("t_chestplate", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.CHEST, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_LEGGINGS = ITEMS.register("t_leggings", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.LEGS, new Item.Properties().group(element_t.TAB)));

    public static final RegistryObject<ArmorItem> T_BOOTS = ITEMS.register("t_boots", () ->
            new ArmorItem(ModArmorMaterial.ELEMENT, EquipmentSlotType.FEET, new Item.Properties().group(element_t.TAB)));


    //Blocks
    public static final RegistryObject<Block>  T_ORE = BLOCKS.register("t_ore", TOre::new);
    public static final RegistryObject<Block>  T_ORE_BLOCK = BLOCKS.register("t_ore_block", TOreBlock::new);
    public static final RegistryObject<Block>  T_GRASS_BLOCK = BLOCKS.register("t_grass_block", () -> new GrassBlock(Block.Properties.from(Blocks.GRASS_BLOCK)));

    //Block Items
    public static final RegistryObject<Item>  T_ORE_ITEM = ITEMS.register("t_ore", () -> new BlockItemBase(T_ORE.get()));
    public static final RegistryObject<Item>  T_ORE_BLOCK_ITEM = ITEMS.register("t_ore_block", () -> new BlockItemBase(T_ORE_BLOCK.get()));
    public static final RegistryObject<Item>  T_GRASS_ITEM = ITEMS.register("t_grass_block", () -> new BlockItemBase(T_GRASS_BLOCK.get()));


}
