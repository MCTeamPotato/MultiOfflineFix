package team.teampotato.multiofflinefix.fabric;

import team.teampotato.multiofflinefix.MultiOfflineFix;
import net.fabricmc.api.ModInitializer;

public class MultiOfflineFixModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiOfflineFix.init();
    }
}
