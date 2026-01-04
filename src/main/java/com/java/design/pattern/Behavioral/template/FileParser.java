package com.java.design.pattern.Behavioral.template;

abstract class FileParser {

    // Template Method
    final void parseFile() {
        openFile();
        parseData();
        closeFile();
    }

    void openFile() {
        System.out.println("Opening file");
    }

    void closeFile() {
        System.out.println("Closing file");
    }

    // Variable step
    abstract void parseData();
}
