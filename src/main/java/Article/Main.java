package Article;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        String exampleBody = "1. Lav en klasse Article der har tre attributter: heading, body og author. Lav test-kode der sætter alle tre attributter, og sørg for at body er en lang tekst - f.eks. indholdet af denne øvelsesbeskrivelse!";
        Article article = new Article("Java Classes", exampleBody, "John Doe");

        System.out.println("Heading: " + article.getHeading());
        System.out.println("Author: " + article.getAuthor());
        System.out.println("Body: " + article.getBody());

        System.out.println("\nLongest Word: " + article.getLongestWord());

        List<String> uniqueWords = article.getWords();
        System.out.println("\nUnique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
