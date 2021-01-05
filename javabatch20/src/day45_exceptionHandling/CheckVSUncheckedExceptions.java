package day45_exceptionHandling;

public class CheckVSUncheckedExceptions {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
