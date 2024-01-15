package Names;

public class Names {

    private String firstName;

    private String middleName;

    private String lastName;

    // Konstruktør der modtager et fullName og splitter det op
    public Names(String fullName) {
        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length == 1) {
            // Kun fornavn
            firstName = nameParts[0];
            middleName = "";
            lastName = "";
        } else if (nameParts.length == 2) {
            // Kun fornavn og efternavn
            firstName = nameParts[0];
            middleName = "";
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            // Fornavn, mellemnavn og efternavn
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            // Håndter tilfælde med flere end tre dele
            System.out.println("Ugyldigt fulde navn format.");
            firstName = "";
            middleName = "";
            lastName = "";
        }
    }

    // toString-metode der skriver det fulde navn ud
    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return "Full name: " + firstName + " " + lastName;
        } else {
            return "Full name: " + firstName + " " + middleName + " " + lastName;
        }
    }
}
