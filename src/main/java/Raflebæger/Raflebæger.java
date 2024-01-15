package Raflebæger;

import java.util.ArrayList;
import java.util.List;

public class Raflebæger {

    private List<Terning> terninger;

    // Konstruktør
    public Raflebæger(int antalTerninger) {
        terninger = new ArrayList<>();
        for (int i = 0; i < antalTerninger; i++) {
            terninger.add(new Terning());
        }
    }

    // Metode til at ryste bægeret og returnere det samlede antal øjne
    public int ryst() {
        int sum = 0;
        for (Terning terning : terninger) {
            sum += terning.kast();
        }
        return sum;
    }

    // Metode til at se øjnene på terningerne uden at ryste igen
    public List<Integer> se() {
        List<Integer> øjne = new ArrayList<>();
        for (Terning terning : terninger) {
            øjne.add(terning.getØjne());
        }
        return øjne;
    }
}
