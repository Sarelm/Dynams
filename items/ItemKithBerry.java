package com.sarelm.dynams.items;

import com.sarelm.dynams.Dynams;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import com.sarelm.dynams.DynamCreativeTab;

public class ItemKithBerry extends ItemFood{
	public ItemKithBerry(int amount, float saturation, boolean isWolfFood) {
		super(1, 0.5f, false);
	}
	public static ItemKithBerry itemKithBerry;
	public static void init()
	{
	itemKithBerry = (ItemKithBerry) registerItem(new ItemFood(1, 0.5f, false), "ItemKithBerry")
			.setUnlocalizedName(Dynams.MODID + ".ItemKithBerry").setMaxStackSize(64)
			.setCreativeTab(null);
	}
	private static Item registerItem(ItemFood itemFood, String string) {
		return null;
	}
}
