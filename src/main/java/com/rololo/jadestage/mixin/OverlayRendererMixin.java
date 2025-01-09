package com.rololo.jadestage.mixin;

import com.rololo.jadestage.JadeStage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import snownee.jade.overlay.OverlayRenderer;
import snownee.jade.overlay.TooltipRenderer;

@Mixin(value = OverlayRenderer.class, remap = false)
public class OverlayRendererMixin {

    @Inject(method = "renderOverlay", at = @At("HEAD"), cancellable = true)
    private static void renderOverlay(TooltipRenderer tooltipRenderer, GuiGraphics graphics, CallbackInfo ci){
        if(JadeStage.isStaged(Minecraft.getInstance().player, JadeStage.JadeGameStage)){
            ci.cancel();
        }
    }

}
