package FilmOUTOFDATE;

import java.time.LocalDate;

public class FilmOLD {
    private String filmtitel;
    private int udgivelsesÅr;
    private String producer;

    public FilmOLD(String filmtitel, int udgivelsesÅr, String producer) {
        this.filmtitel = filmtitel;
        this.udgivelsesÅr = LocalDate.now().getYear();
        this.producer = producer;
    }
    public String getFilmtitel() {
        return filmtitel;
    }
    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }
    public String getProducer() {
        return producer;
    }
}
