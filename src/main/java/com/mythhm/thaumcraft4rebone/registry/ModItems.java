package com.mythhm.thaumcraft4rebone.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

}
