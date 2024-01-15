package BMI;

public class BMI {

    private double height; // i meter

    private double weight; // i kilogram

    // Konstruktør
    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Metode til at beregne BMI
    public double calculate() {
        return weight / (height * height);
    }

    // Metode til at tjekke om BMI er under 18.5 (Underweight)
    public boolean isUnderWeight() {
        double bmi = calculate();
        return bmi < 18.5;
    }

    // Metode til at tjekke om BMI er over 25 (Overweight)
    public boolean isOverWeight() {
        double bmi = calculate();
        return bmi > 25;
    }

    // Metode til at tjekke om BMI er mellem 18.5 og 25 (Normal weight)
    public boolean isNormalWeight() {
        double bmi = calculate();
        return bmi >= 18.5 && bmi <= 25;
    }
}
