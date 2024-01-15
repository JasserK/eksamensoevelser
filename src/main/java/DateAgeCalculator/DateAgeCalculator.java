package DateAgeCalculator;

public class DateAgeCalculator {

    private int yourAge;

    private int dateAge;

    // Konstruktør
    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    // Metode til at beregne lavest acceptable dateAge
    public int calculateLowestAcceptableDateAge() {
        return yourAge / 2 + 7;
    }

    // Metode til at checke om date er for ung
    public boolean isDateTooYoung() {
        int lowestAcceptableDateAge = calculateLowestAcceptableDateAge();
        return dateAge < lowestAcceptableDateAge;
    }

    // Getter for yourAge
    public int getYourAge() {
        return yourAge;
    }

    // Getter for dateAge
    public int getDateAge() {
        return dateAge;
    }
}
