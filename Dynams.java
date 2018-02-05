package com.sarelm.dynams;


import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;


import org.apache.logging.log4j.Logger;

import com.sarelm.dynams.items.ItemKithBerry;

@Mod(modid = Dynams.MODID, name = Dynams.NAME, version = Dynams.VERSION)
public class Dynams
{
    public static final String MODID = "dynams";
    public static final String NAME = "Dynams";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide = "sarelm.dynams.proxy.ClientProxy", 
    		serverSide = "sarelm.dynams.proxy.ServerProxy")
    
    @Mod.Instance
    public static CommonProxy proxy;
    public static Dynams Instance;
    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
       proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
    public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		Dynams.logger = logger;
	}
	@Mod.EventBusSubscriber
    public class CommonProxy {
		@SubscribeEvent
		public void registerItems(RegistryEvent.Register<Item> event) {
			event.getRegistry().register(
					new ItemKithBerry(1, 0.5f, false));
		}
    	public void preInit(FMLPreInitializationEvent event) {
    		
    	}
    	public void init(FMLInitializationEvent event) {
    		
    	}
    	public void postInit(FMLPostInitializationEvent event) {
    		
    	}
    }
	@Mod.EventBusSubscriber(Side.CLIENT)
	public class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent event) {
            super.preInit(event);
        }

        @SubscribeEvent
        public void registerModels(ModelRegistryEvent event) {
        }

  }
	public class ServerProxy extends CommonProxy{
	
	}
	
}

