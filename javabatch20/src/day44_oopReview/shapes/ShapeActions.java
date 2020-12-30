package day44_oopReview.shapes;

import java.util.ArrayList;
import java.util.List;

import static day44_oopReview.shapes.ShapeManager.*;

public class ShapeActions {
    public static void main(String[] args) {

        drawSquare((Square)buildShape("square"));

        drawShape(buildShape("shape"));

        System.out.println("-------------");

        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diamond());

        drawShape(myList);



    }
}
