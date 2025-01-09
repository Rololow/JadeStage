package com.rololo.jadestage;

import net.darkhax.gamestages.GameStageHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;

@Mod("jadestage")
public class JadeStage {
    public static String JadeGameStage = "";

    public static boolean isStaged(Player entity, String stage) {
        return (!stage.isEmpty() && !GameStageHelper.hasStage(entity, stage));
    }
}