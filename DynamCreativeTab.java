package com.sarelm.dynams;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DynamCreativeTab extends CreativeTabs{	
	public static CreativeTabs DynamCreativeTab;
	public static void load() {
		DynamCreativeTab = new DynamCreativeTab(CreativeTabs.getNextID());
	}
	public DynamCreativeTab(int id) {
		super("Dynams");
	}

	@Override
	public ItemStack getTabIconItem() {
		return null;
	}
	
	

}
