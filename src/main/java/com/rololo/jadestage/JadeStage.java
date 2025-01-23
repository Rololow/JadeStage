package com.rololo.jadestage;

import net.darkhax.gamestages.GameStageHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JadeStage.MODID)
public class JadeStage
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "jadestage";

    public static String JadeGameStage = "";

    public static boolean isStaged(Player entity, String stage) {
        return (!stage.isEmpty() && !GameStageHelper.hasStage(entity, stage));
    }
}
