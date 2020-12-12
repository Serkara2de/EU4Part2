package a_review.week12;

public class Rectangle extends Shape {
    public double width, length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        name = "Rectangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea(){
        return width * length ;
    }

    @Override
    public double calculatePerimeter(){
        return 2* (width+length);
    }


}
