package com.java.design.pattern.Behavioral.memento;

import java.util.Stack;

class Caretaker {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento m) {
        history.push(m);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
