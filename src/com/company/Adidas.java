package com.company;

public abstract class Adidas implements Cleanable {

    private final int guaranteeInDays = 365;
    private final String brand = "Adidas";
    private String sole;
    private String material;
    private String color;
    private boolean waterproof;

    public void cleanWithWater() {
        System.out.println("The shoes are being cleaned with water...");
    }
}
