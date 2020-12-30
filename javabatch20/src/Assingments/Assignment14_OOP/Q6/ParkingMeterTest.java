package Assingments.Assignment14_OOP.Q6;

public class ParkingMeterTest {

    public static void main(String[] args) {
        ParkingMeter pm = new ParkingMeter(36);
        System.out.println(pm.add(27));
        pm.tick();
        System.out.println(pm.isExpired());
        System.out.println(pm.timeLeft);

    }
}
