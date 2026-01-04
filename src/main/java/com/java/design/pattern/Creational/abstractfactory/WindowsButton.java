package com.java.design.pattern.Creational.abstractfactory;

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows Button");
    }
}

class MacButton implements Button {
    public void paint() {
        System.out.println("Mac Button");
    }
}
