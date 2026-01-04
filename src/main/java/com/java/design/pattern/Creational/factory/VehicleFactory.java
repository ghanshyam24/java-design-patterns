package com.java.design.pattern.Creational.factory;

class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        throw new IllegalArgumentException("Invalid vehicle type");
    }
}
