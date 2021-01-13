package day48_collection_part3;

import day46_collection_part1.Product;

import java.util.*;

public class LoopMap {

    public static void main(String[] args) {
        Map<String,String> dataMap = new HashMap<>();

        dataMap.put("url", "qa3.vytrack.com");
        dataMap.put("username", "user66");
        dataMap.put("password", "abc66");
        dataMap.put("browser", "chrome");
        dataMap.put("truckdriver", "Bob");
        dataMap.put("storemanager", "John");

        //keySet - > returns set with all the keys in the map
        //values - > returns with all the values in the map

        System.out.println("======KEYS======");
        for (String key : dataMap.keySet()) {
            System.out.print(key+" ");
        }

        System.out.println();

        System.out.println("======VALUES======");
        for (String value : dataMap.values()) {
            System.out.print(value+" ");
        }

        System.out.println("====KEYS | VALUES=====");
        for(String key : dataMap.keySet()) {
            System.out.println(key +"|"+dataMap.get(key));
        }

        //Looping by using forEach method
        dataMap.forEach((k,v ) -> System.out.println(k + "|" + v));

        Map<Integer, Product> studentMap = new HashMap<>();
        Map<String,String[]> data = new HashMap<>();
        Map<Integer,List<String>> data2 = new HashMap<>();
        Map<Integer,List<String[]>> data3 = new HashMap<>();
        Map<String,Map<Integer,Integer>> data4 = new HashMap<>();
        Map<String,Map<Integer,Product>> data5 = new HashMap<>();
    }
}
