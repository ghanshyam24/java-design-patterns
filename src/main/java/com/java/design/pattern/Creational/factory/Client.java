package com.java.design.pattern.Creational.factory;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        vehicle.drive();
    }
}
