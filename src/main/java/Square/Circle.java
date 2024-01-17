package Square;

public class Circle implements Shape {

    private double radius;

    // Konstruktør
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementering af getArea-metoden fra interfacet
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
