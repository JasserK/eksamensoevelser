package Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret en liste af blandede cirkler og kvadrater
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Circle(5.5));
        shapes.add(new Square(8.0));

        // Loop til at beregne og udskrive arealet af hver figur
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("Square Area: " + shape.getArea());
            } else if (shape instanceof Circle) {
                System.out.println("Circle Area: " + shape.getArea());
            }
        }
    }
}
