package day38_inheritance_part2;

public class FullTimeEmployee extends Employee{


    public void calculatePay(int hours, double rate){
        double total= (hours*rate)*1.05;

        System.out.println("Full Time Employee total pay: "+total);
    }

}
