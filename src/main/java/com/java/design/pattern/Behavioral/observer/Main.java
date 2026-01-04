package com.java.design.pattern.Behavioral.observer;

import com.java.design.pattern.Behavioral.observer.impl.MobileDisplay;
import com.java.design.pattern.Behavioral.observer.impl.TVDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer mobile = new MobileDisplay();
        Observer tv = new TVDisplay();

        station.registerObserver(mobile);
        station.registerObserver(tv);

        station.setTemperature(30);
        station.setTemperature(35);
    }
}
