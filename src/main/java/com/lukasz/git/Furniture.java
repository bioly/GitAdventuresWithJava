package com.lukasz.git;

/**
 * Created by lukasz_letocha on 5/30/16.
 */
public class Furniture {

    private final String name;
    private final int price;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
