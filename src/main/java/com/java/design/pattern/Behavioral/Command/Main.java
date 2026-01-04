package com.java.design.pattern.Behavioral.Command;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV();
        Light light = new Light();

        Command tvOn = new TVOnCommand(tv);
        Command lightOn = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(tvOn);
        remote.pressButton(); // TV is ON

        remote.setCommand(lightOn);
        remote.pressButton(); // Light is ON
    }
}
