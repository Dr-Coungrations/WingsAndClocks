package drcoungrations.wingsandclocks.util;

import drcoungrations.wingsandclocks.block.BlockKufariy;
import drcoungrations.wingsandclocks.block.BlockKufariyOre;
import drcoungrations.wingsandclocks.init.Blocks;
import drcoungrations.wingsandclocks.item.ItemKufariyIgnot;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockKufariyOre(Material.ROCK, SoundType.STONE, "blockKufariy_ore", "kufariy_ore_block"),
                new BlockKufariy(Material.IRON, SoundType.METAL, "blockKufariy", "kufariy_block")
        };
 
        event.getRegistry().registerAll(blocks);
	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {

				new ItemKufariyIgnot("itemKufariy_ignot", "kufariy_ignot_item"),

		};
		
		final Item[] itemBlocks = {
                new ItemBlock(Blocks.KUFARIY_ORE_BLOCK).setRegistryName(Blocks.KUFARIY_ORE_BLOCK.getRegistryName()),
                new ItemBlock(Blocks.KUFARIY_BLOCK).setRegistryName(Blocks.KUFARIY_BLOCK.getRegistryName()),
 
        };

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

}
