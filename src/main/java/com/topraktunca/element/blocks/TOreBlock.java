package com.topraktunca.element.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TOreBlock extends Block {

    public TOreBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(25.0f, 1000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
