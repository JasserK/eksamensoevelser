package Bil;

public class Bil {

    private String model;

    private int vægt;

    private Trailer trailer;

    // Konstruktør
    public Bil(String model, int vægt) {
        this.model = model;
        this.vægt = vægt;
        this.trailer = null;
    }

    // Metode til at tilkoble en trailer, hvis totalvægten ikke overskrider 3500 kg
    public void tilkoblTrailer(Trailer trailer) {
        if (totalVægt() + trailer.getVægt() <= 3500) {
            this.trailer = trailer;
        } else {
            System.out.println("Kan ikke tilkoble trailer. Totalvægten overskrider 3500 kg.");
        }
    }

    // Metode til at beregne totalvægten af bilen og trailer
    public int totalVægt() {
        int totalVægt = vægt;
        if (trailer != null) {
            totalVægt += trailer.getVægt();
        }
        return totalVægt;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for vægt
    public int getVægt() {
        return vægt;
    }

    // Getter for trailer
    public Trailer getTrailer() {
        return trailer;
    }
}
