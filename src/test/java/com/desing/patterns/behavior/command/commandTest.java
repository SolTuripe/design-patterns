package com.desing.patterns.behavior.command;

import com.desing.patterns.behavior.command.commandExample.accessories.Tv;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.Command;
import com.desing.patterns.behavior.command.commandExample.conCommand.commands.CommandTvOn;
import com.desing.patterns.behavior.command.commandExample.conCommand.device.SmartControl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class commandTest {
    @Autowired
    Command button;

    @Test
    void CommandCanExecuteButtons() {
        Tv tv = new Tv();

        SmartControl smartControl = new SmartControl();
        smartControl.setButton1(new CommandTvOn(tv));

        var sut=smartControl.clickButton1();

        assertEquals("Turn on tv", sut);

    }
}
