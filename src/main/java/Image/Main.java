package Image;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        Image image1 = new Image("example.jpg", 800, 600);
        Image image2 = new Image("landscape.png", 1200, 800);
        Image image3 = new Image("portrait.gif", 400, 600);

        // Udskriv egenskaber og resultater af testmetoder
        System.out.println("Image 1: " + image1.getFileName());
        System.out.println("Known File Type: " + image1.isKnownFileType());
        System.out.println("Is Portrait: " + image1.isPortrait());
        System.out.println("Is Landscape: " + image1.isLandscape());

        System.out.println("\nImage 1: " + image2.getFileName());
        System.out.println("Known File Type: " + image2.isKnownFileType());
        System.out.println("Is Portrait: " + image2.isPortrait());
        System.out.println("Is Landscape: " + image2.isLandscape());

        System.out.println("\nImage 1: " + image3.getFileName());
        System.out.println("Known File Type: " + image3.isKnownFileType());
        System.out.println("Is Portrait: " + image3.isPortrait());
        System.out.println("Is Landscape: " + image3.isLandscape());
    }
}
