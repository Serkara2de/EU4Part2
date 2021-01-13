package day48_collection_part3;

import day46_collection_part1.Product;


import java.util.*;
import java.util.TreeSet;

public class HashSetOfProducts {
    public static void main(String[] args) {


        Set<Product> prodSet = new TreeSet<>();
        prodSet.add(new Product("book",25.99));
        prodSet.add(new Product("book", 19.99));
        prodSet.add(new Product("magazine", 7.99));

        System.out.println(prodSet.toString());

        //print each product by using for each loop
        for (Product product : prodSet) {
            System.out.println(product.getPrice());

        }

        System.out.println("=====Foreach Method=====");

        //print each product by using forEach method
        prodSet.forEach(x -> System.out.println(x.getName()));
    }
}
