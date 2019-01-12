package drcoungrations.wingsandclocks;

import org.apache.logging.log4j.Logger;

import drcoungrations.wingsandclocks.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WingsAndClocksMod.MODID, name = WingsAndClocksMod.NAME, version = WingsAndClocksMod.VERSION, acceptedMinecraftVersions = WingsAndClocksMod.MC_VERSION)
public class WingsAndClocksMod {

	public static final String MODID = "wingsandclocksmod";
	public static final String NAME = "Wings and Clocks";
	public static final String VERSION = "0.1 Dev";
	public static final String MC_VERSION = "[1.12.2]";

	public static final String CLIENT = "drcoungrations.wingsandclocks.proxy.ClientProxy";
	public static final String SERVER = "drcoungrations.wingsandclocks.proxy.ServerProxy";
	
	@SidedProxy(clientSide = WingsAndClocksMod.CLIENT, serverSide = WingsAndClocksMod.SERVER)
	public static IProxy proxy;

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("WingsAndClocksMod.NAME " + "says hi!");
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
