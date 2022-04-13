package com.desing.patterns.behavior.command.commandExample.accessories;

public class Tv {

    public String on() {
        return "Turn on tv";
    }

    public void off() {
        System.out.println("Turn off the tv");
    }
}
