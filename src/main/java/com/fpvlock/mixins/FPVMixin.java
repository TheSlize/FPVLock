package com.fpvlock.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class FPVMixin {
    @Shadow
    public GameSettings gameSettings;
    @Inject(method = "processKeyBinds", at = @At("HEAD"), cancellable = true)
    private void processFPV(CallbackInfo info){
        if(this.gameSettings.keyBindTogglePerspective.isPressed()){
            info.cancel();
        }
    }
}
