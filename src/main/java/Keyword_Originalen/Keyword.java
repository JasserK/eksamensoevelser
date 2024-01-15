package Keyword_Originalen;

import java.util.ArrayList;
import java.util.List;

public class Keyword {

    private String word;

    private String definition;

    private List<Keyword> seeAlso;

    // Konstruktør
    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    // Metode til at checke om søgeordet matcher
    public boolean matches(String søgeord) {
        return word.toLowerCase().contains(søgeord.toLowerCase());
    }

    // Tilføj "see also" attribut der henviser til andre keywords
    public void tilføjSeeAlso(Keyword keyword) {
        seeAlso.add(keyword);
    }

    // Udskriftsmetode
    public void udskriv() {
        System.out.println("Word: " + word);
        System.out.println("Definition: " + definition);

        if (!seeAlso.isEmpty()) {
            System.out.println("See Also:");
            for (Keyword keyword : seeAlso) {
                System.out.println("- " + keyword.getWord());
            }
        }
    }

    // Getter for word
    public String getWord() {
        return word;
    }
}
