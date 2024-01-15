package BMI;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        BMI personBMI = new BMI(1.75, 70);

        double calculatedBMI = personBMI.calculate();
        System.out.println("BMI: " + calculatedBMI);

        System.out.println("Is underweight? " + personBMI.isUnderWeight());
        System.out.println("Is overweight? " + personBMI.isOverWeight());
        System.out.println("Is normal weight? " + personBMI.isNormalWeight());
    }
}
