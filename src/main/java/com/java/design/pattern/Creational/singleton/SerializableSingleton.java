package com.java.design.pattern.Creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final SerializableSingleton INSTANCE =
            new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}
