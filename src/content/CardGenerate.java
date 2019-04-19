package content;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CardGenerate extends Card{

    

    

    public static void Generate(String [] deckSuit, LinkedList deckValue) {

        for (int sub = 0; sub < deckSuit.length; sub++) {
            Card one = new Card();
            Random rand1 = new Random();
            int random1 = rand1.nextInt(13) + 1;
            one.setValue(random1);
            deckValue.add(one.getValue());
            
            Random rand2 = new Random();
            int random2 = rand2.nextInt(4);
            one.setSuit(Card.SUIT[random2]);  
            deckSuit[sub]=one.getSuit();
        }
        
        
    }

}
