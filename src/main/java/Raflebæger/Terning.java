package Raflebæger;

import java.util.Random;

public class Terning {

    private int øjne;

    private Random random;

    // Konstruktør
    public Terning() {
        random = new Random();
        kast();
    }

    // Metode til at kaste terningen og returnere antal øjne
    public int kast() {
        øjne = random.nextInt(6) + 1; // Simulerer et terningkast med værdier fra 1 til 6
        return øjne;
    }

    // Metode til at få antallet af øjne på terningen uden at kaste igen
    public int getØjne() {
        return øjne;
    }
}
