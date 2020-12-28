package Assingments.Assignment14_OOP.Q1;

public class AttsTest {

    public static void main(String[] args) {

        Atts a = new Atts();// default constructor that java creates (without parameters)

        a.name = "table";
        a.color = "brown";
        a.amount = 1;

        System.out.println(a.asString());
    }
}
