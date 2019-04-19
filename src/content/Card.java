
package content;

public class Card {
private String suit=new String();  
public  static final String []SUIT={"HEARTS","DIAMONDs","CLUBS","SPADES"};
private int value; 

public void setSuit(String suit){
this.suit=suit; 
}
public String getSuit(){
return suit;
}

public void setValue(int value){
this.value=value;
}
public int getValue(){
return this.value;
}
}
