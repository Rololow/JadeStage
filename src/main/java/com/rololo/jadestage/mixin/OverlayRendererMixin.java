package com.rololo.jadestage.mixin;

import com.rololo.jadestage.JadeStage;
import net.minecraft.client.Minecraft;
import com.mojang.blaze3d.vertex.PoseStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import snownee.jade.overlay.OverlayRenderer;
import snownee.jade.overlay.TooltipRenderer;

@Mixin(value = OverlayRenderer.class, remap = false)
public class OverlayRendererMixin {

    @Inject(method = "renderOverlay", at = @At("HEAD"), cancellable = true)
    private static void renderOverlay(TooltipRenderer tooltip, PoseStack matrixStack, CallbackInfo ci){
        if(JadeStage.isStaged(Minecraft.getInstance().player, JadeStage.JadeGameStage)){
            ci.cancel();
        }
    }

}
