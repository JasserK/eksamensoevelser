package Card;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        Card card1 = new Card("hearts", 7);
        Card card2 = new Card("diamonds", 7);
        Card card3 = new Card("spades", 4);

        System.out.println("Card1 beats Card2: " + card1.beats(card2));
        System.out.println("Card2 beats Card3: " + card2.beats(card3));
        System.out.println("Card3 beats Card1: " + card3.beats(card1));
    }
}
