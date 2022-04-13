package com.desing.patterns.behavior.command.commandExample.conCommand.commands;

import com.desing.patterns.behavior.command.commandExample.accessories.Light;

public class CommandLightOff implements Command {

    Light light;

    public CommandLightOff(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        light.turnOff();
        return null;
    }
}
