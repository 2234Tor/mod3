package com.topraktunca.element.blocks;

import com.topraktunca.element.element_t;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(element_t.TAB));
    }
}
