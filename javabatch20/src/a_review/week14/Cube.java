package a_review.week14;

public class Cube extends Shape implements hasVolume{

    double height;
    double volume;

    public Cube(double height, double volume) {
        this.height = height;
        this.volume = volume;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    static {
        name = "Cube";
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
