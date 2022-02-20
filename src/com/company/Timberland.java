package com.company;

public abstract class Timberland extends Shoe {

    private final String brand = "Timberland";
    private final int guaranteeInDays = 70;

    public Timberland(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }
}
