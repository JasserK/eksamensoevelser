package User;

import java.util.Random;

public class User {

    private String fullName;

    private String userID;

    // Konstruktør
    public User(String fullName) {
        this.fullName = fullName;
        this.userID = createUserID();
    }

    // Metode til at validere userID-format
    public boolean validUserID() {
        // Tjek om userID har det rette format: fire (små) bogstaver efterfulgt af fire cifre
        return userID.matches("[a-z]{4}\\d{4}");
    }

    // Metode til at generere et userID ud fra fullName
    public String createUserID() {
        // Split fullName til fornavn og efternavn
        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length >= 2) {
            String firstName = nameParts[0].toLowerCase().substring(0, Math.min(2, nameParts[0].length()));
            String lastName = nameParts[1].toLowerCase().substring(0, Math.min(2, nameParts[1].length()));

            // Generer fire tilfældige cifre
            Random random = new Random();
            int randomDigits = 1000 + random.nextInt(9000);

            // Sammensæt userID
            userID = firstName + lastName + randomDigits;
        } else {
            // Hvis fullName ikke indeholder mindst to dele, sæt userID til en default-værdi
            userID = "default0000";
        }
        return userID;
    }

    // Getter for fullName
    public String getFullName() {
        return fullName;
    }

    // Getter for userID
    public String getUserID() {
        return userID;
    }
}
