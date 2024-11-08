package com.mythhm.thaumcraft4rebone.datagen;

import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // 原始代码：为所有方块生成掉落自身的规则
        // ModBlocks.BLOCKS.getEntries().forEach(block -> dropSelf(block.get()));

        // 现在只生成 SILVER_WOOD_PLANKS 的掉落规则
        dropSelf(ModBlocks.SILVER_WOOD_PLANKS.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        // 原始代码：返回所有已注册的方块
        // return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

        // 现在只返回指定的 SILVER_WOOD_PLANKS 方块
        return Set.of(ModBlocks.SILVER_WOOD_PLANKS.get());
    }
}
