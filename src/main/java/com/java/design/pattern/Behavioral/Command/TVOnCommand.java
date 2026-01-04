package com.java.design.pattern.Behavioral.Command;

class TVOnCommand implements Command {
    private TV tv;
    TVOnCommand(TV tv) { this.tv = tv; }
    public void execute() { tv.on(); }
}

class LightOnCommand implements Command {
    private Light light;
    LightOnCommand(Light light) { this.light = light; }
    public void execute() { light.on(); }
}
