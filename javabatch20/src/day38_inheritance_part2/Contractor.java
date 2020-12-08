package day38_inheritance_part2;

public class Contractor extends Employee{


    @Override
    public void calculatePay(int hours, double rate) {
        double total= (hours*rate)*200;

        System.out.println("Contractor total pay: "+total);
    }

}
