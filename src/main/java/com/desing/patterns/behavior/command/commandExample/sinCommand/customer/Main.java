package com.desing.patterns.behavior.command.commandExample.sinCommand.customer;

import com.desing.patterns.behavior.command.commandExample.accessories.Light;
import com.desing.patterns.behavior.command.commandExample.accessories.Tv;
import com.desing.patterns.behavior.command.commandExample.sinCommand.device.SmartControl;

public class Main {

    public static void main(String[] args) {

        SmartControl control = new SmartControl();

        Light light = new Light();
        Tv tv = new Tv();

        control.setLuz(light);
        control.setTv(tv);

        control.clickButton1();
        control.clickButton3();
        control.clickButton2();
        control.clickButton4();
    }
}
