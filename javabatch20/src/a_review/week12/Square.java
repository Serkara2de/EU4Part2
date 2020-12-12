package a_review.week12;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        this.side = side;
        name= "Square";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
