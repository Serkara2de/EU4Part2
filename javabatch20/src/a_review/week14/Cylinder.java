package a_review.week14;

public class Cylinder extends Shape implements hasVolume{

    double height;
    double radius;
    double volume;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    static {
        name = "Cylinder";
    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * height)+((4 * Math.PI * Math.pow(radius,2)));
    }

    @Override
    public double calculateVolume() {
        return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
