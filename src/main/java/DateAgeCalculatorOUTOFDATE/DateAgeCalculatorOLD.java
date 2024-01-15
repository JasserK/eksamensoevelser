package DateAgeCalculatorOUTOFDATE;

public class DateAgeCalculatorOLD {

    private int yourAge;

    private int dateAge;

    public DateAgeCalculatorOLD(int yourAge) {
        this.yourAge = yourAge;
        calculateDateAge();
    }

    private void calculateDateAge() {
        dateAge = yourAge / 2 + 7;
    }

    public boolean isDateTooYoung(int partnerAge) {
        return partnerAge < dateAge;
    }

    public int getDateAge() {
        return dateAge;
    }
}
