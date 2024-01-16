package JuleGave;

import java.util.Random;

public class JuleGave {

    private boolean isSoft;

    private boolean isRectangular;

    private boolean doesRattle;

    // Konstruktør
    public JuleGave() {
        Random random = new Random();
        isSoft = random.nextBoolean();
        isRectangular = random.nextBoolean();
        doesRattle = random.nextBoolean();
    }

    // Metode til at tjekke om JuleGaven måske er LEGO
    public boolean couldBeLego() {
        return !isSoft && isRectangular && doesRattle;
    }

    public boolean isSoft() {
        return isSoft;
    }

    public boolean isRectangular() {
        return isRectangular;
    }

    public boolean isDoesRattle() {
        return doesRattle;
    }
}
