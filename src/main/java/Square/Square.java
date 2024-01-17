package Square;

public class Square implements Shape {

    private double width;

    // Konstruktør
    public Square(double width) {
        this.width = width;
    }

    // Implementering af getArea-metoden fra interfacet
    @Override
    public double getArea() {
        return width * width;
    }
}
