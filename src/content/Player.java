package content;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Player {

    private String playerID = new String();
    private String Decks = new String();
    public String[] deckSuit = new String[26];
    public LinkedList deckValue = new LinkedList();

    public Player(String name) {
        this.playerID = name;
    }

    public String getPLayerID() {
        return playerID;
    }

    public void addData() {

    }

    public final void setPlayerDeck(){
        GroupOfCard one=new GroupOfCard();
        deckSuit= one.getDeckSuit();
        deckValue=one.getDeckValue();
    }

    public  final String printPlayerDeck() {
        String print = new String();
        for(int sub=0;sub<deckSuit.length;sub++){
        print +=  "\n"+deckValue.get(sub)+" - "+deckSuit[sub];
        }
        return print;
    }
    
 
}
