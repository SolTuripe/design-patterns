package com.desing.patterns.behavior.command.commandExample.conCommand.commands;

import com.desing.patterns.behavior.command.commandExample.accessories.Tv;

public class CommandTvOff implements Command {

    Tv tv;

    public CommandTvOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
