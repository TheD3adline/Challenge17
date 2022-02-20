package com.company;

public class NikeAir extends Nike {

    private final String model = "NikeAir";

    public NikeAir(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the NikeAir (Nike) way...");
    }
}
