package com.desing.patterns.behavior.command.commandExample.sinCommand.device;

import com.desing.patterns.behavior.command.commandExample.accessories.Light;
import com.desing.patterns.behavior.command.commandExample.accessories.Tv;

public class SmartControl {
    private Tv tv;
    private Light light;

    public void clickButton1() {
        tv.on();
    }

    public void clickButton2() {
        tv.off();
    }

    public void clickButton3() {
        light.turnOn();
    }

    public void clickButton4() {
        light.turnOff();
    }

    public Tv getTv() {
        return tv;
    }
    public void setTv(Tv tv) {
        this.tv = tv;
    }
    public Light getLuz() {
        return light;
    }
    public void setLuz(Light luz) {
        this.light = light;
    }
}
