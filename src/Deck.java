import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
    private static Card[] cards;
    Random rand;
    public Deck(int seed){
        cards = new Card[52];
        rand = new Random(seed);
        for (int i = 0; i < 52; i++){
            cards[i] = new Card(i);
        }
    }
    public void shuffle(int n){
        for (int i = 0; i < n; i++) {
            int index1 = rand.nextInt(cards.length);
            int index2 = rand.nextInt(cards.length);

            Card temp = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = temp;

        }
    }
    public Hand deal(){
        Hand ret;
        Card[] hand = new Card[5];
        System.arraycopy(cards, 0, hand, 0, 5);
        ret = new Hand(hand);
        return ret;
    }

    public static void printDeck(){
        for(int i = 0; i < 5; i++){
            System.out.print(cards[i] + " " );
        }
        System.out.println();
//        for (int i = 0, rowCnt = 1; i < cards.length; i++){
//            if (rowCnt % 5 != 0){
//                System.out.print(cards[i] + " ");
//                rowCnt++;
//            }
//            else{
//                rowCnt = 1;
//                System.out.println(cards[i] +  " ");
//            }
//        }
    }
}
