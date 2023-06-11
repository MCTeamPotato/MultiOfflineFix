package team.teampotato.multiofflinefix.mixin;

import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {


    @Inject(at = @At("HEAD"), method = "isMultiplayerEnabled", cancellable = true)
    private void allowMultiplayer(CallbackInfoReturnable<Boolean> info) {
        info.setReturnValue(true);
        info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChatRestriction", cancellable = true)
    private void allowChat(CallbackInfoReturnable<Boolean> info) {
        info.setReturnValue(true);
        info.cancel();
    }

    @Unique
    public MinecraftClient.ChatRestriction getChatRestriction() {
        return MinecraftClient.ChatRestriction.ENABLED;
    }
}