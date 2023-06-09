package team.teampotato.common.MultiOfflineFix.mixin;

import com.mojang.authlib.minecraft.SocialInteractionsService;
import net.minecraft.client.Minecraft;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Minecraft.class)
public class MultiOfflineFixMixin {
    private SocialInteractionsService SocialInteractionsService;
    @Inject(at = @At("HEAD"),method = "allowsMultiplayer",cancellable = true)
    public void Multiplayer(CallbackInfoReturnable<Boolean> callbackInfo) {
        callbackInfo.setReturnValue(true);
        callbackInfo.cancel();
    }
    @Inject(at = @At("HEAD"),method = "allowsChat",cancellable = true)
    public void Chat(CallbackInfoReturnable<Boolean> callbackInfo) {
        callbackInfo.setReturnValue(true);
        callbackInfo.cancel();
    }
}
