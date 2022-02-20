package com.company;

public abstract class Nike extends Shoe {

    private final String brand = "Nike";
    private final int guaranteeInDays = 50;

    public Nike(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }
}
