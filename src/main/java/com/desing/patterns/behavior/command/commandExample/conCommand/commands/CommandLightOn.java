package com.desing.patterns.behavior.command.commandExample.conCommand.commands;

import com.desing.patterns.behavior.command.commandExample.accessories.Light;

public class CommandLightOn implements Command {

    Light light;

    public CommandLightOn(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        light.turnOn();
        return null;
    }
}
