package com.lukasz.git;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        List<Furniture> furniture = Arrays.asList(
                new Furniture("Table", 123),
                new Furniture("Sofa", 350),
                new Furniture("Old Clock", 200),
                new Furniture("Lamp", 100),
                new Furniture("Bed", 450),
                new Furniture("Picture", 500)
        );

        System.out.println("Print furniture using declarative approach: ");
        furniture.forEach(System.out::println);
    }
}
