package team.teampotato.multiofflinefix.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import team.teampotato.multiofflinefix.MultiOfflineFix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MultiOfflineFix.MOD_ID)
public class MultiOfflineFixForge {
    public MultiOfflineFixForge() {
        EventBuses.registerModEventBus(MultiOfflineFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MultiOfflineFix.init();
    }
}
