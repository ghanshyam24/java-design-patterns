package com.java.design.pattern.Behavioral.iterator;

class BookIterator implements Iterator {

    private String[] books;
    private int index = 0;

    BookIterator(String[] books) {
        this.books = books;
    }

    public boolean hasNext() {
        return index < books.length;
    }

    public Object next() {
        return books[index++];
    }
}
