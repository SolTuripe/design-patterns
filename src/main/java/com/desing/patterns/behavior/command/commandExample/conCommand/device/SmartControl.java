package com.desing.patterns.behavior.command.commandExample.conCommand.device;

import com.desing.patterns.behavior.command.commandExample.conCommand.commands.Command;

public class SmartControl {

    private Command button1;
    private Command button2;
    private Command button3;
    private Command button4;

    public String clickButton1() {
        return button1.execute();
    }

    public void clickButton2() {
        button2.execute();
    }

    public void clickButton3() {
        button3.execute();
    }

    public void clickButton4() {
        button4.execute();
    }

    public Command getButton1() {
        return button1;
    }

    public void setButton1(Command button1) {
        this.button1 = button1;
    }

    public Command getButton2() {
        return button2;
    }

    public void setButton2(Command button2) {
        this.button2 = button2;
    }

    public Command getButton3() {
        return button3;
    }

    public void setButton3(Command button3) {
        this.button3 = button3;
    }

    public Command getButton4() {
        return button4;
    }

    public void setButton4(Command button4) {
        this.button4 = button4;
    }
}
