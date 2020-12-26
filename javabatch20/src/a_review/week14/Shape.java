package a_review.week14;
/*
1. create an abstract class called Shape
            attributes:
                name(static), area, perimeter, hasVolume(static), volume
            abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
                        return-types: double

 */
public abstract class Shape {

    static String name;
    double area;
    int perimeter;
    static boolean hasVolume;
    double volume;


    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();








}
