package drcoungrations.wingsandcloks;

import org.apache.logging.log4j.Logger;

import drcoungrations.wingsandcloks.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WingsAndCloksMod.MODID, name = WingsAndCloksMod.NAME, version = WingsAndCloksMod.VERSION, acceptedMinecraftVersions = WingsAndCloksMod.MC_VERSION)
public class WingsAndCloksMod {

	public static final String MODID = "wingsandcloksmod";
	public static final String NAME = "Wings and Clocks";
	public static final String VERSION = "0.1 Dev";
	public static final String MC_VERSION = "[1.12.2]";

	public static final String CLIENT = "drcoungrations.wingsandclocks.proxy.ClientProxy";
	public static final String SERVER = "drcoungrations.wingsandclocks.proxy.ServerProxy";

	@SidedProxy(clientSide = WingsAndCloksMod.CLIENT, serverSide = WingsAndCloksMod.SERVER)
	public static IProxy proxy;

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("WingsAndCloksMod.NAME " + "says hi!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
