package Article;

import java.util.ArrayList;
import java.util.List;

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

    // Hjælpefunktion til at fjerne uønskede tegn fra et ord
    private String cleanWord(String dirtyWord) {
        String cleanWord = "";
        for (char ch : dirtyWord.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                cleanWord += ch;
            }
        }
        return cleanWord;
    }

    // Metode til at finde det længste ord i body
    public String getLongestWord() {
        String[] words = body.split("\\s+"); // Del op i ord
        String longestWord = "";
        for (String word : words) {
            word = cleanWord(word);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Metode til at få en liste af alle ord fra body uden gentagelser
    public List<String> getWords() {
        String[] words = body.split("\\s+"); // Del op i ord
        List<String> uniqueWordsList = new ArrayList<>();
        for (String word : words) {
            word = cleanWord(word);
            if (!word.isEmpty() && !uniqueWordsList.contains(word)) {
                uniqueWordsList.add(word);
            }
        }
        return uniqueWordsList;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }
}
