package com.java.design.pattern.Creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton using Enum");
    }
}


//Pros
//
//Thread-safe
//
//Serialization safe
//
//Reflection safe
//
//Simplest & safest
//
//❌ Cons
//
//Less flexible
//
//Cannot extend classes