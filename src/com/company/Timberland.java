package com.company;

public abstract class Timberland implements Cleanable {

    private final int guaranteeInDays = 730;
    private final String brand = "Timberland";
    private String sole;
    private String material;
    private String color;
    private boolean waterproof;

    public void cleanWithWater() {
        System.out.println("The shoes are being cleaned with water...");
    }
}
