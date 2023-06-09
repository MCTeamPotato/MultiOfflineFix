package team.teampotato.forge.MultiOfflineFix;

import me.shedaniel.architectury.platform.forge.EventBuses;
import team.teampotato.common.MultiOfflineFix.MultiOfflineFix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MultiOfflineFix.MOD_ID)
public class MultiOfflineFixForge {
    public MultiOfflineFixForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MultiOfflineFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MultiOfflineFix.init();
    }
}
