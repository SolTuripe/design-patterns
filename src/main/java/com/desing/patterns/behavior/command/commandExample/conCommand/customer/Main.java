package com.desing.patterns.behavior.command.commandExample.conCommand.customer;

import com.desing.patterns.behavior.command.commandExample.conCommand.device.Configuration;
import com.desing.patterns.behavior.command.commandExample.conCommand.device.SmartControl;

public class Main {
    public static void main(String[] args) {

        SmartControl control = new SmartControl();

        Configuration.configuration(control);

        control.clickButton1();
        control.clickButton3();
        control.clickButton2();
        control.clickButton4();
    }
}
