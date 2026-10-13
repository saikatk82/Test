import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckShuffler {
    public static void main(String [] args){
        List<String> deck = createDeck();
        System.out.println("Original Deck :" + deck);
        Collections.shuffle(deck);
        System.out.println("Shuffled Deck :" + deck);
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        for( String suit : suits){
            for(String rank : ranks){
                deck.add(rank +" of " + suit);
            }
        }
        return deck;
    }


}
