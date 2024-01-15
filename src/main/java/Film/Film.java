package Film;

import java.time.Year;

public class Film {

    private String filmtitel;

    private int udgivelsesår;

    private Producer producer;

    // Konstruktør med filmtitel og udgivelsesår
    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    // Konstruktør med filmtitel, sætter udgivelsesåret til det aktuelle år
    public Film(String filmtitel) {
        this(filmtitel, Year.now().getValue());
    }

    // Metode til at koble en producer til filmen
    public void kobleProducer(Producer producer) {
        this.producer = producer;
    }

    // Metode til at få information om filmen
    public String getInfo() {
        String producerInfo = (producer != null) ? "Producer: " + producer.getNavn() : "Ingen producer tilknyttet";
        return "Filmtitel: " + filmtitel + "\nUdgivelsesår: " + udgivelsesår + "\n" + producerInfo;
    }
}
