package com.mythhm.thaumcraft4rebone.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModItems {

    //新建物品
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);

    //方块物品

    //宏伟原木
    public static final RegistryObject<Item> GREAT_WOOD_LOG = ITEMS.register("great_wood_log",
            () -> new BlockItem(ModBlocks.GREAT_WOOD_LOG.get(), new Item.Properties()));

    //宏伟木板
    public static final RegistryObject<Item> GREAT_WOOD_PLANKS = ITEMS.register("great_wood_planks",
            () -> new BlockItem(ModBlocks.GREAT_WOOD_PLANKS.get(), new Item.Properties()));

    //宏伟原木
    public static final RegistryObject<Item> SILVER_WOOD_LOG = ITEMS.register("silver_wood_log",
            () -> new BlockItem(ModBlocks.SILVER_WOOD_LOG.get(), new Item.Properties()));

    //宏伟木板
    public static final RegistryObject<Item> SILVER_WOOD_PLANKS = ITEMS.register("silver_wood_planks",
            () -> new BlockItem(ModBlocks.SILVER_WOOD_PLANKS.get(), new Item.Properties()));

    //矿石物品
    public static final RegistryObject<Item> AIR_ORE = ITEMS.register("air_ore",
            () -> new BlockItem(ModBlocks.AIR_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> FIRE_ORE = ITEMS.register("fire_ore",
            () -> new BlockItem(ModBlocks.FIRE_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> EARTH_ORE = ITEMS.register("earth_ore",
            () -> new BlockItem(ModBlocks.EARTH_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ORDER_ORE = ITEMS.register("order_ore",
            () -> new BlockItem(ModBlocks.ORDER_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ENTROPY_ORE = ITEMS.register("entropy_ore",
            () -> new BlockItem(ModBlocks.ENTROPY_ORE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WATER_ORE = ITEMS.register("water_ore",
            () -> new BlockItem(ModBlocks.WATER_ORE.get(), new Item.Properties()));

    //碎片
    public static final RegistryObject<Item> AIR_SHARD = ITEMS.register("air_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIRE_SHARD = ITEMS.register("fire_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER_SHARD = ITEMS.register("water_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EARTH_SHARD = ITEMS.register("earth_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORDER_SHARD = ITEMS.register("order_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENTROPY_SHARD = ITEMS.register("entropy_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BALANCED_SHARD = ITEMS.register("balanced_shard",
            () -> new Item(new Item.Properties()));


}
