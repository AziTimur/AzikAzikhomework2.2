package com.company;

public class Eagle extends Animal implements Printable{
    private int wings;

    public Eagle(int age, String name, Color color) {
        super(age, name, color);
    }

    public Eagle(int age, String name, Color color, int wings) {
        super(age, name, color);
        this.wings = wings;
    }

    @Override
    public void print() {
        System.out.println(name+" "+color+" " +age+" "+wings+"метр");
    }
}
