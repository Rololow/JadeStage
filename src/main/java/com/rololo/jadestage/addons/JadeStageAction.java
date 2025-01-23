package com.rololo.jadestage.addons;

import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import com.blamejared.crafttweaker.api.zencode.IScriptLoadSource;
import com.rololo.jadestage.JadeStage;
import org.apache.logging.log4j.Logger;

public class JadeStageAction implements IRuntimeAction {
    public final String stage;

    public JadeStageAction(String stage) {
        this.stage = stage;
    }

    public void apply() {
        JadeStage.JadeGameStage = this.stage;
    }

    public String describe() {
        return "Restricted Jade on " + this.stage + ".stage";
    }

    public String systemName() {
        return "JadeStage";
    }

    public boolean shouldApplyOn(IScriptLoadSource source, Logger logger) {
        return true;
    }

}
