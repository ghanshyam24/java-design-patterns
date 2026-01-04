package com.java.design.pattern.Behavioral.observer.impl;

import com.java.design.pattern.Behavioral.observer.Observer;

public class MobileDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("Mobile Display updated: " + temperature);
    }
}
