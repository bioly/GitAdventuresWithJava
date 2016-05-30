package com.lukasz.git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
                new Furniture("Picture", 500),
                new Furniture("Tea pod", 23),
                new Furniture("Closet", 455)
        );

        System.out.println("Print furniture using declarative approach: ");
        furniture.forEach(System.out::println);

        System.out.println("Filter out the ones which are more expensive than 300:" +
                furniture.stream()
                        .filter(f -> f.getPrice() > 300)
                        .collect(Collectors.toList()));
    }
}
