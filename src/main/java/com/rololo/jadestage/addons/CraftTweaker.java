package com.rololo.jadestage.addons;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.action.base.IAction;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeType.Method;
import org.openzen.zencode.java.ZenCodeType.Name;

@ZenRegister
@Name("mods.jadestage.JadeStage")
public class CraftTweaker {
    @Method
    public static void setStage(String stage) {
        CraftTweakerAPI.apply((IAction)new JadeStageAction(stage));

    }
}
