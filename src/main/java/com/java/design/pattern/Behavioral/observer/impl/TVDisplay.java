package com.java.design.pattern.Behavioral.observer.impl;

import com.java.design.pattern.Behavioral.observer.Observer;

public class TVDisplay implements Observer {
    public void update(int temperature) {
        System.out.println("TV Display updated: " + temperature);
    }
}
