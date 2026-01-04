package com.java.design.pattern.Behavioral.Command;

class RemoteControl {
    private Command command;
    void setCommand(Command command) { this.command = command; }
    void pressButton() { command.execute(); }
}
