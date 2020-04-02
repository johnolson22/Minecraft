package com.Br0th3rB34r.TutorialMod.items;

import com.Br0th3rB34r.TutorialMod.Main;
import com.Br0th3rB34r.TutorialMod.init.ModItems;
import com.Br0th3rB34r.TutorialMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
