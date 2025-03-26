package me.programmer.mod;

import me.zero.alpine.bus.EventManager;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import me.zero.alpine.bus.EventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(modid = "mod", name = "Mod", version = "0.0.1")
public class Mod {
    public static final String MOD_ID = "mod";
    public static final String MOD_NAME = "Mod";
    public static final String VERSION = "0.0.1";
    public static final String suffix = "";
    @Mod.Instance("mod")
    public static Mod INSTANCE;
    public static final EventBus EVENT_BUS;

    public Mod Mod() {

    }

    @Mod.EventHandler
    public void preinit(final FMLPreInitializationEvent fmlPreInitializationEvent) {
      this.preinit(fmlPreInitializationEvent);
      
      // Mod Events
      
      System.out.println("Mod has loaded!");
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        this.init(event);

        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Mod.EventHandler
    public void postinit(final FMLPostInitializationEvent fmlPostInitializationEvent) {
        this.postinit(fmlPostInitializationEvent);
    }
}

