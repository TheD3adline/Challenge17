package com.company;

public class Boatshoes extends Timberland {

    private final String model = "Boatshoes";

    public Boatshoes(String sole, String material, String color, boolean waterproof) {
        super(sole, material, color, waterproof);
    }

    public void tieShoes() {
        System.out.println("You tie the shoes in the Boatshoes (Timberland) way...");
    }
}
