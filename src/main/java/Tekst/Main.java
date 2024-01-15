package Tekst;

public class Main {
    public static void main(String[] args) {
        Tekst tekstObjekt = new Tekst();

        tekstObjekt.tilføj("Dette er linje 1.");
        tekstObjekt.tilføj("Dette er linje 2.");
        tekstObjekt.tilføj("Dette er linje 1."); // En gentaget linje

        int antalUnikke = tekstObjekt.findAntalUnikke();
        System.out.println("Antal unikke tekstlinjer: " + antalUnikke); // Forventet output: 2
    }
}
