package drcoungrations.wingsandclocks.block;

import drcoungrations.wingsandclocks.WingsAndClocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockKufariy extends Block {
	

    public BlockKufariy(Material material, String unlocalizedName, String registryName) {
        this(Material.IRON, SoundType.METAL, "blockKufariy", "kufariy_block");
    }
 
    public BlockKufariy(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(Material.IRON);
        setUnlocalizedName(WingsAndClocksMod.MODID + "." + "blockKufariy");
        setRegistryName("kufariy_block");
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(SoundType.METAL);
        setHardness(13F);
        setResistance(10F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1F);
    }

}
