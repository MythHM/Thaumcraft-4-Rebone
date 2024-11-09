package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SaddleItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModItemModelProvider extends ItemModelProvider{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID,existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //普通物品
        simpleItem(ModItems.AIR_ORE);
        simpleItem(ModItems.WATER_ORE);
        simpleItem(ModItems.ORDER_ORE);
        simpleItem(ModItems.ENTROPY_ORE);
        simpleItem(ModItems.FIRE_ORE);
        simpleItem(ModItems.EARTH_ORE);

        simpleItem(ModItems.AIR_SHARD);
        simpleItem(ModItems.WATER_SHARD);
        simpleItem(ModItems.ORDER_SHARD);
        simpleItem(ModItems.ENTROPY_SHARD);
        simpleItem(ModItems.FIRE_SHARD);
        simpleItem(ModItems.EARTH_SHARD);

        //手持物品
        //handheldItem(ModItems.FIRE_ORE);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MODID,"item/" + item.getId().getPath()));
    }
}
