package com.java.design.pattern.Creational.builders;

public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard(true)
                .bluetooth(true)
                .build();
    }
}
