package com.desing.patterns.behavior.command.commandExample.conCommand.device;

import com.desing.patterns.behavior.command.commandExample.accessories.Light;
import com.desing.patterns.behavior.command.commandExample.accessories.Tv;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.CommandLightOff;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.CommandLightOn;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.CommandTvOff;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.CommandTvOn;

public class Configuration {

    public static void configuration(SmartControl ci) {
        Light light = new Light();
        Tv tv = new Tv();

        ci.setButton3(new CommandLightOn(light));
        ci.setButton4(new CommandLightOff(light));
        ci.setButton1(new CommandTvOn(tv));
        ci.setButton2(new CommandTvOff(tv));
    }
}
