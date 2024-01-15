package Article;

public class Article {

    private String heading;

    private String body;

    private String author;

    // Konstruktør
    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    // Metode til at finde det længste ord i body
    public String getLongestWord() {
        String[] words = body.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
