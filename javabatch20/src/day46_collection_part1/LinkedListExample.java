package day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("((LinkedList<Integer>) list).getFirst() = " + ((LinkedList<Integer>) list).getFirst());

    }
}
