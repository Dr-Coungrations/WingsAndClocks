package drcoungrations.wingsandclocks.block;

import drcoungrations.wingsandclocks.WingsAndClocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockKufariyOre extends Block {
	

    public BlockKufariyOre(Material material, String unlocalizedName, String registryName) {
        this(Material.ROCK, SoundType.STONE, "blockKufariy_ore", "kufariy_ore_block");
    }
 
    public BlockKufariyOre(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(Material.ROCK);
        setUnlocalizedName(WingsAndClocksMod.MODID + "." + "blockKufariy_ore");
        setRegistryName("kufariy_ore_block");
        setCreativeTab(CreativeTabs.MISC);
        setSoundType(SoundType.STONE);
        setHardness(11F);
        setResistance(8F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0F);
    }

}