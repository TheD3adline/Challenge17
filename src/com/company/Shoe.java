package com.company;

public abstract class Shoe {

    private String sole;
    private String material;
    private String color;
    private boolean waterproof;

    public Shoe(String sole, String material, String color, boolean waterproof) {
        this.sole = sole;
        this.material = material;
        this.color = color;
        this.waterproof = waterproof;
    }

    public abstract void tieShoes();

    public void cleanWithWater() {
        System.out.println("You clean the shoes with water...");
    }
}
