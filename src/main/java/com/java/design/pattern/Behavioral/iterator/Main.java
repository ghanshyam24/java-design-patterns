package com.java.design.pattern.Behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        Aggregate collection = new BookCollection();
        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
