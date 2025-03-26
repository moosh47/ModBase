package me.programmer.mod.mixin;

import org.apache.logging.log4j.LogManager;
import java.util.Map;
import javax.annotation.Nullable;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.Name("ExampleMod")
@IFMLLoadingPlugin.SortingIndex(1002)
@IFMLLoadingPlugin.TransformerExclusions({ "me.programmer.mod.mixin.client", "me.programmer.mod.mixin.block", "me.programmer.mod.mixin.accessor" })
public class MixinLoader implements IFMLLoadingPlugin
{
    public static final Logger log;
    
    public MixinLoader() {
        MixinLoader.log.info("Initializing ExampleMod mixins");
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.mod.json");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        MixinLoader.log.info("mod mixins initialized");
    }
    
    public String[] getASMTransformerClass() {
        return new String[0];
    }
    
    public String getModContainerClass() {
        return null;
    }
    
    @Nullable
    public String getSetupClass() {
        return null;
    }
    
    public void injectData(final Map map) {
    }
    
    public String getAccessTransformerClass() {
        return null;
    }
    
    static {
        log = LogManager.getLogger("mod mixins");
    }
}

