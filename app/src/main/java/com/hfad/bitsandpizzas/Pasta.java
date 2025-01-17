package com.hfad.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.funghi),
            new Pasta("Lasagne", R.drawable.diavolo)
    };

    private Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }


    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}