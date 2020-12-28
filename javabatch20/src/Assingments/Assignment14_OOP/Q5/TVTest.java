package Assingments.Assignment14_OOP.Q5;

public class TVTest {
    public static void main(String[] args) {
        System.out.println("===========TV 1============");
        TV tv1 = new TV();

        System.out.println();
        System.out.println("===========TV 2============");


        TV tv2 = new TV("SONY");

        tv2.isOn(true); // default false now tv on
        tv2.channelDown(); // channel value was 1 now 0
        tv2.channelUp(); // channel value was 0 now 1
        tv2.volumeDown(); // volumeLevel value was 1 now 0
        tv2.volumeUp(); // volumeLevel value was 1 now 0


        System.out.println();
        System.out.println("===========TV 3============");

        TV tv3 = new TV(2,3,false,"LG");

        tv3.isOff();
        tv3.turnOn();
        tv3.volumeUp();
        System.out.println(tv3.volumeLevel);
        tv3.on=false;
        tv3.volumeUp();





    }
}
