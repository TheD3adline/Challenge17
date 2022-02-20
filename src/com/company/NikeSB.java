package com.company;

public class NikeSB extends Nike {

    private final String model = "NikeSB";

    public NikeSB(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the NikeSB (Nike) way...");
    }
}
