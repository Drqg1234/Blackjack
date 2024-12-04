import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){

        Scanner file = new Scanner(System.in);
//        System.out.println("Enter the seed value :");
//        int seed = file.nextInt();
        Deck a = new Deck(-100);

        for (int i = 0; i < 5; i++){
            a.printDeck();
            a.shuffle(676);
            Hand current = a.deal();

            //System.out.println(Arrays.toString(current.getCards()));
        }
    }
}