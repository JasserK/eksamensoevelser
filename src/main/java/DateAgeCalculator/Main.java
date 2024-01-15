package DateAgeCalculator;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        DateAgeCalculator calculator = new DateAgeCalculator(30, 21);

        System.out.println("Your age: " + calculator.getYourAge());
        System.out.println("Date age: " + calculator.getDateAge());
        System.out.println("Lowest acceptable date age: " + calculator.calculateLowestAcceptableDateAge());
        System.out.println("Is date too young? " + calculator.isDateTooYoung());
    }
}
