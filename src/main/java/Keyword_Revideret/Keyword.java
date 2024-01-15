package Keyword_Revideret;

import java.util.ArrayList;
import java.util.List;

public class Keyword {

    private String name;

    private String description;

    private List<Keyword> seeAlso;

    // Konstruktør
    public Keyword(String name, String description) {
        this.name = name;
        this.description = description;
        this.seeAlso = new ArrayList<>();
    }

    // Tilføj "see also" attribut der henviser til andre keywords
    public void tilføjSeeAlso(Keyword keyword) {
        seeAlso.add(keyword);
    }

    // Udskriftsmetode
    public void udskriv() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);

        if (!seeAlso.isEmpty()) {
            System.out.println("See Also:");
            for (Keyword keyword : seeAlso) {
                System.out.println("- " + keyword.getName());
            }
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
