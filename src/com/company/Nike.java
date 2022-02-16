package com.company;

public abstract class Nike implements Cleanable {

    private final int guaranteeInDays = 548;
    private final String brand = "Nike";
    private String sole;
    private String material;
    private String color;
    private boolean waterproof;

    public void cleanWithWater() {
        System.out.println("The shoes are being cleaned with water...");
    }
}
