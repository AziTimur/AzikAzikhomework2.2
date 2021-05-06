package com.company;

public class Cow extends Animal implements Printable {
    private String breed;

    public Cow(int age, String name, Color color) {
        super(age, name, color);
    }

    public Cow(int age, String name, Color color, String breed) {
        super(age, name, color);
        this.breed=breed;
    }

    @Override
    public void print() {
        System.out.println(name+" "+color+" " +age+" "+breed);
    }
}
