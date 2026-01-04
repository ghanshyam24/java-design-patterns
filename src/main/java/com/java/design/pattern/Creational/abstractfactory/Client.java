package com.java.design.pattern.Creational.abstractfactory;

public class Client {
    private Button button;

    public Client(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // change easily
        Client app = new Client(factory);
        app.paint();
    }
}
