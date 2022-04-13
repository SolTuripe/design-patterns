package com.desing.patterns.behavior.command.commandExample.conCommand.commands;

import com.desing.patterns.behavior.command.commandExample.accessories.Tv;

public class CommandTvOn implements Command {

    Tv tv;

    public CommandTvOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
