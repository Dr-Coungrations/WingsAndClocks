package drcoungrations.wingsandclocks.item;

import drcoungrations.wingsandclocks.WingsAndClocksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKufariyIgnot extends Item {
	 
    public ItemKufariyIgnot(String unlocalizedName, String registryName) {
        setUnlocalizedName(WingsAndClocksMod.MODID + "." + "itemKufariy_ignot");
        setRegistryName("kufariy_ignot_item");
        setCreativeTab(CreativeTabs.MISC);
    }
 
}