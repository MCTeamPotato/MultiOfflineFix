package team.teampotato.fabric.MultiOfflineFix;

import team.teampotato.common.MultiOfflineFix.MultiOfflineFix;
import net.fabricmc.api.ModInitializer;

public class MultiOfflineFixModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MultiOfflineFix.init();
    }
}
