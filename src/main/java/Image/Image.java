package Image;

public class Image {

    private String fileName;

    private int width;

    private int height;

    // Konstruktør
    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    // Metode til at tjekke om filtypen er kendt
    public boolean isKnownFileType() {
        String[] knownFileTypes = {".gif", ".jpg", ".jpeg", ".png", ".webp", ".bmp"};
        for (String fileType : knownFileTypes) {
            if (fileName.toLowerCase().endsWith(fileType)) {
                return true;
            }
        }
        return false;
    }

    // Metode til at tjekke om billedet er i portrætorientering
    public boolean isPortrait() {
        return height > width;
    }

    // Metode til at tjekke om billedet er i liggende orientering (landscape)
    public boolean isLandscape() {
        return width > height;
    }

    // Getter for fileName
    public String getFileName() {
        return fileName;
    }
}
