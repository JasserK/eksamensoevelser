package JuleGave;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        JuleGave juleGave = new JuleGave();

        // Udskriv egenskaberne for JuleGaven
        System.out.println("Er den blød?: " + juleGave.isSoft());
        System.out.println("Er den rektangulær?: " + juleGave.isRectangular());
        System.out.println("Rasler den?: " + juleGave.isDoesRattle());

        // Tjek om JuleGaven måske er LEGO
        if (juleGave.couldBeLego()) {
            System.out.println("JuleGaven kunne måske være LEGO!");
        } else {
            System.out.println("JuleGaven er sandsynligvis ikke LEGO.");
        }
    }
}
