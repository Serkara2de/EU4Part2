package day48_collection_part3;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> items2 = new ArrayList<>();
        items2.add(10);

        Map<String, Double> items = new HashMap<>();
        items.put("Apple", 3.99);
        items.put("Flower", 10.0);
        items.put("Milk", 1.49);
        items.put("Eggs", 1.64);
        items.put("Cherries", 5.59);
        items.put("Apple", 4.50);

        System.out.println(items.size());

        System.out.println(items.toString());

        System.out.println(items.isEmpty());

        System.out.println(items.get("Apple"));
        System.out.println(items.get("Milk"));
        System.out.println(items.get("Apple"));

        items.remove("Flower");
        System.out.println(items.toString());

        System.out.println("Is Apple there? " + items.containsKey("Apple"));
        System.out.println("Is Flower there? " + items.containsKey("Flower"));
        System.out.println("Is Bananas there? " + items.containsKey("Bananas"));

        items.replace("Eggs", 2.34);
        System.out.println("Replaced price of the Eggs: "+items.get("Eggs"));

        items.put("Milk", 1.99);
        System.out.println("Updated price of Milk: "+items.get("Milk"));

        //increase price of cherries by $2
        items.replace("Cherries",items.get("Cherries")+2);
        System.out.println("New price of Cherries after increment: "+items.get("Cherries"));

    }
}
