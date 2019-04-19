
package content;

import java.util.ArrayList;
import java.util.LinkedList;

public class GroupOfCard {
private String deckSuit[] = new String[26];
private LinkedList deckValue = new LinkedList();        



public String[] getDeckSuit(){
    CardGenerate.Generate(deckSuit, deckValue);
return deckSuit;
}
public LinkedList getDeckValue(){
return deckValue;
}
}
