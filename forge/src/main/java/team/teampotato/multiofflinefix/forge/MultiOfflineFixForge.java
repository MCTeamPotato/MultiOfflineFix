package team.teampotato.multiofflinefix.forge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import team.teampotato.multiofflinefix.MultiOfflineFix;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MultiOfflineFix.MOD_ID)
public class MultiOfflineFixForge {
    public MultiOfflineFixForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::onInitialize);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onInitialize(FMLCommonSetupEvent event) {
        MultiOfflineFix.init();
    }
}
