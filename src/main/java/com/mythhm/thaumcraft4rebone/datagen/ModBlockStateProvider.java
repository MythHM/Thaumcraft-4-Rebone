package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.mythhm.thaumcraft4rebone.Thaumcraft4Rebone.MODID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.AIR_ORE);
    }
    public void blockWithItem(RegistryObject<Block> block){
        simpleBlockWithItem(block.get(),cubeAll(block.get()));
    }
}
