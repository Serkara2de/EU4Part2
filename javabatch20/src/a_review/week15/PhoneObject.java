package a_review.week15;

public class PhoneObject {
    public static void main(String[] args) {

        IPhone phone1 = new IPhone("11", 1999,8.0);
        Phone phone2 = new IPhone("8", 1000, 6.5);
        Object phone3 = new IPhone("5", 500, 6.5);
        AppleApp phone4 = new IPhone("7", 1500, 7.0);

        phone1.faceTiming(12313313);
        ((IPhone) phone2).faceTiming(124124121);
        ((IPhone) phone4).faceTiming(31213241);
    }
}
