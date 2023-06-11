package team.teampotato.multiofflinefix.fabric;


import net.fabricmc.api.ModInitializer;

import team.teampotato.multiofflinefix.MultiOfflineFix;

public class MultiOfflineFixModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiOfflineFix.init();
    }
}
