package com.java.design.pattern.Behavioral.iterator;

class BookCollection implements Aggregate {

    private String[] books = {"Java", "Design Patterns", "OOP"};

    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
