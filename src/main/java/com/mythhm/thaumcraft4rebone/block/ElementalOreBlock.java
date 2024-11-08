package com.mythhm.thaumcraft4rebone.block;

import com.mythhm.thaumcraft4rebone.registry.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class ElementalOreBlock extends Block {
    private final String elementType; // 矿石类型：Air, Fire, Earth, Order, Entropy

    public ElementalOreBlock(String elementType) {
        super(BlockBehaviour.Properties.of().strength(2.0f, 2.0f));
        this.elementType = elementType;
    }

    public String getElementType() {
        return elementType;
    }
}
