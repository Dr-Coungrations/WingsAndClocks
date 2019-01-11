package drcoungrations.wingsandcloks.item;

import drcoungrations.wingsandcloks.WingsAndCloksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKufariyIgnot extends Item {
	 
    public ItemKufariyIgnot(String unlocalizedName, String registryName) {
        setUnlocalizedName(WingsAndCloksMod.MODID + "." + "itemKufariy_ignot");
        setRegistryName("kufariy_ignot_item");
        setCreativeTab(CreativeTabs.MISC);
    }
 
}