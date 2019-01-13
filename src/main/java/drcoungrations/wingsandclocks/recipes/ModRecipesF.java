package drcoungrations.wingsandclocks.recipes;

import drcoungrations.wingsandclocks.init.MBlocks;
import drcoungrations.wingsandclocks.init.MItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipesF {

    public static void initSmelting() {
    	
    	GameRegistry.addSmelting(MBlocks.KUFARIY_ORE_BLOCK, new ItemStack(MItems.KUFARIY_IGNOT_ITEM), 15.0F);
 
    }
    
}
