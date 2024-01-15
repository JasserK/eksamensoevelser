package Card;

public class Card {

    private String suit;

    private int value;

    // Konstruktør
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Metode til at afgøre om dette kort slår et andet kort
    public boolean beats(Card otherCard) {
        // Sammenlign kun værdierne først
        if (this.value > otherCard.getValue()) {
            return true;
        } else if (this.value < otherCard.getValue()) {
            return false;
        } else {
            // Hvis værdierne er ens, sammenlign suits
            return compareSuits(this.suit, otherCard.getSuit());
        }
    }

    // Privat metode til at sammenligne suits
    private boolean compareSuits(String suit1, String suit2) {
        // Rækkefølge: spade > hearts > diamonds > clubs
        if (suit1.equals("spades")) {
            return true;
        } else if (suit2.equals("spades")) {
            return false;
        } else if (suit1.equals("hearts")) {
            return true;
        } else if (suit2.equals("hearts")) {
            return false;
        } else if (suit1.equals("diamonds")) {
            return true;
        } else if (suit2.equals("diamonds")) {
            return false;
        } else {
            // Hvis ingen af de ovenstående betingelser er opfyldt, suits er clubs
            return true;
        }
    }

    // Getter for suit
    public String getSuit() {
        return suit;
    }

    // Getter for value
    public int getValue() {
        return value;
    }
}
