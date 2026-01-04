package com.java.design.pattern.Creational.prototype;

class Document implements Prototype {

    private String content;

    public Document() {
        // Expensive operation only once
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = "Important Data";
    }

    public void show() {
        System.out.println(content);
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
