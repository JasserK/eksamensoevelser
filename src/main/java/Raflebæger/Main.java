package Raflebæger;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test af klasserne
        Raflebæger bæger = new Raflebæger(3);

        // Ryst bægeret
        int sum = bæger.ryst();
        System.out.println("Samlet antal øjne efter ryst: " + sum);

        // Se øjnene uden at ryste igen
        List<Integer> øjne = bæger.se();
        System.out.println("Øjne på terningerne uden at ryste igen: " + øjne);
    }
}
