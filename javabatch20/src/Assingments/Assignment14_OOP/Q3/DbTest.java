package Assingments.Assignment14_OOP.Q3;

public class DbTest {
    public static void main(String[] args) {
        Db db = new Db();
        db.insertData("aaa",123);

        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        System.out.println("==============================");
        System.out.println("After assigning new values");
        System.out.println("==============================");

        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());
        System.out.println(db.getYint());
    }
}
