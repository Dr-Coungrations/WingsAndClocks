package drcoungrations.wingsandclocks.item;

import drcoungrations.wingsandclocks.WingsAndClocksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKey extends Item {
	 
    public ItemKey(String unlocalizedName, String registryName) {
        setUnlocalizedName(WingsAndClocksMod.MODID + "." + "itemKey");
        setRegistryName("key_item");
        setCreativeTab(CreativeTabs.MISC);
    }
 
}