package Film;

public class Producer {

    private String navn;

    // Konstruktør
    public Producer(String navn) {
        this.navn = navn;
    }

    // Metode til at få navnet på produceren
    public String getNavn() {
        return navn;
    }
}
