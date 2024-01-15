package Film;

public class Main {
    public static void main(String[] args) {
        // Test af klasserne
        Producer producer1 = new Producer("Steven Spielberg");
        Producer producer2 = new Producer("Denis Villeneuve");

        Film film1 = new Film("Jurassic Park", 1993);
        Film film2 = new Film("Dune: Part Two");

        film1.kobleProducer(producer1);
        film2.kobleProducer(producer2);

        System.out.println("Film 1:\n" + film1.getInfo());
        System.out.println("\nFilm 2:\n" + film2.getInfo());
    }
}
