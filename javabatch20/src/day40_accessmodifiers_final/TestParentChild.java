package day40_accessmodifiers_final;

public class TestParentChild {
    public static void main(String[] args) {

        Child c = new Child();
        System.out.println("Value of x before increment "+c.x);

        c.increment();
        System.out.println("Value of x after increment "+c.x);

        Parent p = new Parent();
        System.out.println("Value of x before increment "+p.x);

        p.increment();
        System.out.println("Value of x after increment "+p.x);


    }
}
