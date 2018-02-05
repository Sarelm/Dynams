package com.sarelm.dynams;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DynamCreativeTab extends CreativeTabs{	
	public DynamCreativeTab(String Dynams) {
		super(Dynams);
	}

	@Override
	public ItemStack getTabIconItem() {
		return null;
	}
	

}
