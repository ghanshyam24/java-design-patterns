package com.java.design.pattern.Behavioral.memento;

class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void showText() {
        System.out.println("Text: " + text);
    }

    // Save state
    public EditorMemento save() {
        return new EditorMemento(text);
    }

    // Restore state
    public void restore(EditorMemento memento) {
        text = memento.getSavedText();
    }
}
