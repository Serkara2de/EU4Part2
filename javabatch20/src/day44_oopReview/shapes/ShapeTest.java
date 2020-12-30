package day44_oopReview.shapes;

public class ShapeTest {

    public static void main(String[] args) {

        // crate 4 shapes using polymorphism

        Shape square = new Square();
        square.draw();
        ((Square)square).squareMethod(); // Downcasting: cast reference type to object type

        Shape triangle = new Triangle();
        triangle.draw();

        Shape diamond = new Diamond();
        diamond.draw();

        Object shapeObject = new Shape();





    }
}
