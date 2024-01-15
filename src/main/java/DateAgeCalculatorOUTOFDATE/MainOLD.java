package DateAgeCalculatorOUTOFDATE;

public class MainOLD {
    public static void main(String[] args) {
        int yourAge = 30;
        DateAgeCalculatorOLD calculator = new DateAgeCalculatorOLD(yourAge);

        System.out.println("Din alder: " + yourAge);
        System.out.println("Laveste date alder: " + calculator.getDateAge());

        int partnerAge = 20;
        if (calculator.isDateTooYoung(partnerAge)) {
            System.out.println("Din partner er for ung!");
        } else {
            System.out.println("Din partner er acceptabel alder.");
        }
    }
}
