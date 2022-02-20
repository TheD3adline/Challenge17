package com.company;

public class NmdR1 extends Adidas {

    private final String model = "NMD R1";

    public NmdR1(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the NMD R1 (Adidas) way...");
    }
}
