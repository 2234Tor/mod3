package com.topraktunca.element.items;

import com.topraktunca.element.element_t;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Properties().group(element_t.TAB));
    }
}
