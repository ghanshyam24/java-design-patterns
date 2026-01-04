package com.java.design.pattern.Behavioral.template;

public class Main {
    public static void main(String[] args) {

        FileParser csv = new CSVParser();
        csv.parseFile();

        System.out.println();

        FileParser json = new JSONParser();
        json.parseFile();

        System.out.println();

        FileParser xml = new XMLParser();
        xml.parseFile();
    }
}
