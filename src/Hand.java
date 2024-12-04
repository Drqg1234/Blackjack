import java.util.ArrayList;
import java.util.Arrays;

public class Hand {
    private Card[] hand;
    public Hand(Card[] hand) {
        this.hand = hand;

    }
    public Card[] getCards() {
        Arrays.sort(hand);
        return hand;

    }

    public HandType getHandType(){
        return null;
    }
}
