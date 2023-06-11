package team.teampotato.multiofflinefix.fabric;


import net.fabricmc.api.ModInitializer;

import team.teampotato.multiofflinefix.MultiOfflineFix;

public class MultiOfflineFixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiOfflineFix.init();
    }
}
