package Bil;

public class Main {
    public static void main(String[] args) {
        // Test af klasserne
        Bil bil = new Bil("Toyota", 2000);
        Trailer trailer1 = new Trailer(1200);
        Trailer trailer2 = new Trailer(2000);

        // Tilkobl trailer1
        bil.tilkoblTrailer(trailer1);
        // Man kan undlade at udskrive bilens model og vægt
        System.out.println("Bilmodel: " + bil.getModel());
        System.out.println("Bilvægt: " + bil.getVægt());
        System.out.println("Totalvægt med trailer1: " + bil.totalVægt());

        // Tilkobl trailer2 (vil ikke blive tilkoblet pga. overskridelse af totalvægt)
        bil.tilkoblTrailer(trailer2);
        System.out.println("Totalvægt med trailer2: " + bil.totalVægt());
    }
}
