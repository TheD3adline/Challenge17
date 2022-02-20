package com.company;

public abstract class Adidas extends Shoe {

    private final String brand = "Adidas";
    private final int guaranteeInDays = 60;

    public Adidas(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }
}
