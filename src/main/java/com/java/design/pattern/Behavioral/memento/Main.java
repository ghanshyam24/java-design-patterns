package com.java.design.pattern.Behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Hello");
        caretaker.save(editor.save()); // save state 1

        editor.setText("Hello World");
        caretaker.save(editor.save()); // save state 2

        editor.setText("Hello World!!!");
        caretaker.save(editor.save()); // save state 3

        editor.showText(); // Text: Hello World!!!

        // Undo multiple times
        editor.restore(caretaker.undo());
        editor.showText(); // Undo 1 → Hello World

        editor.restore(caretaker.undo());
        editor.showText(); // Undo 2 → Hello

        editor.restore(caretaker.undo());
        editor.showText(); // Undo 3 → null or original
    }
}
