package Tekst;

import java.util.ArrayList;
import java.util.List;

public class Tekst {
    private List<String> tekstLinjer;

    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }

    public void tilføj(String tekstStreng) {
        tekstLinjer.add(tekstStreng);
    }

    public int findAntalUnikke() {
        List<String> unikkeTekstLinjer = new ArrayList<>();
        for (String linje : tekstLinjer) {
            if (!unikkeTekstLinjer.contains(linje)) {
                unikkeTekstLinjer.add(linje);
            }
        }
        return unikkeTekstLinjer.size();
    }
}
