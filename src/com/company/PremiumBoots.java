package com.company;

public class PremiumBoots extends Timberland {

    private final String model = "PremiumBoots";

    public PremiumBoots(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the PremiumBoots (Timberland) way...");
    }
}
