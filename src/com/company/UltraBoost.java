package com.company;

public class UltraBoost extends Adidas {

    private final String model = "ultraBoost";

    public UltraBoost(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the ultraBoost (Adidas) way...");
    }
}
