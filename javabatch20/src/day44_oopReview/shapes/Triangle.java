package day44_oopReview.shapes;

public class Triangle extends Shape{

    public Triangle() {
        type="triangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
