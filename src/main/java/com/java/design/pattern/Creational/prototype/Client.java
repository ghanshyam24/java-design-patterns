package com.java.design.pattern.Creational.prototype;

public class Client {
    public static void main(String[] args) {

        Document original = new Document(); // expensive once

        Document copy1 = (Document) original.clone();
        Document copy2 = (Document) original.clone();

        copy1.show();
        copy2.show();
    }
}
