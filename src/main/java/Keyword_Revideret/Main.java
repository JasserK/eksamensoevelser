package Keyword_Revideret;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        Keyword java = new Keyword("Java", "A high-level programming language");
        Keyword javascript = new Keyword("JavaScript", "A scripting language for the web");

        // Tilføj "see also" relation mellem Java og JavaScript
        java.tilføjSeeAlso(javascript);

        // Udskriv information om Java
        java.udskriv();
    }
}
