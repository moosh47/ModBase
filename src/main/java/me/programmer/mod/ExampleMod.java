package me.programmer.mod;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@net.minecraftforge.fml.common.Mod(modid = "mod", name = "ExampleMod", version = "0.0.1")
public class ExampleMod {
    public static final String MOD_ID = "mod";
    public static final String MOD_NAME = "ExampleMod";
    public static final String VERSION = "0.0.1";
    public static final String suffix = "";
    public static ExampleMod INSTANCE;
    public ExampleMod Mod() {
        return Mod();
    }

    @net.minecraftforge.fml.common.Mod.EventHandler
    public void preinit(final FMLPreInitializationEvent fmlPreInitializationEvent) {
      this.preinit(fmlPreInitializationEvent);
      
      // ExampleMod Events
      
      System.out.println("ExampleMod has loaded!");
    }

    @net.minecraftforge.fml.common.Mod.EventHandler

    public void init(final FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        this.init(event);

        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @net.minecraftforge.fml.common.Mod.EventHandler

    public void postinit(final FMLPostInitializationEvent fmlPostInitializationEvent) {
        this.postinit(fmlPostInitializationEvent);
    }
}

