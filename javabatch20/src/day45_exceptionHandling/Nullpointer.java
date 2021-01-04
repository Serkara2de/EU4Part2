package day45_exceptionHandling;

public class Nullpointer {

    static String name;

    public static void main(String[] args) {
        try{
            System.out.println(name.toUpperCase());
        }catch(NullPointerException e){
            System.out.println("Nulpointerexception happened");
            System.out.println("Here is the message: " + e.getMessage());
            System.out.println("Here is the trace: ");
            e.printStackTrace();

        }
    }
}
