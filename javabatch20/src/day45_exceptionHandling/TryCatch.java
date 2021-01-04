package day45_exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {


        try {
            String str = "java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5)); // i might have problem here
            System.out.println(str.charAt(1)); // WILL NOT EXECUTED
        }catch(Exception e){
            System.out.println("Exception happened in try block and was caught");
            //EXCEL

        }
        System.out.println("After try catch block");
    }
}
