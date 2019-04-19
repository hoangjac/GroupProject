
package content;

import java.io.PrintWriter;
import java.util.LinkedList;

public class Rungame extends Game{
    
    public Rungame(String gameName, LinkedList playerList) {
        super(gameName, playerList);
    }

    @Override
    public PrintWriter runGame(PrintWriter pw) {
        PrintWriter printScreen = pw;
        Player one = playerInfo.get(0);
        Player two = playerInfo.get(1);
        LinkedList deckValue1 = one.deckValue;
        LinkedList deckValue2 = two.deckValue;
        int sub = 0;
        while (sub < one.deckValue.size() & sub<two.deckValue.size()) {
            int value1 = (int) deckValue1.get(sub);
            int value2 = (int) deckValue2.get(sub);
            pw.println("Start "  + "round" + (sub + 1));
            if (value1 > value2) {
                deckValue1.addLast(deckValue2.get(sub));
                deckValue2.remove(sub);
                pw.append("*****"+one.getPLayerID() + " card's value: " + value1 + " v/s " + two.getPLayerID() + " card's value: " + value2+"*****");
                pw.append("\n"+"Player "+ one.getPLayerID()+" win the round, and get all the card");
                sub++; 
            } else if(value1<value2){{
                deckValue2.addLast(deckValue1.get(sub));
                deckValue1.remove(sub);
                pw.append("*****"+one.getPLayerID() + " card's value: " + value1 + " v/s " + two.getPLayerID() + " card's value: " + value2+"*****");
                pw.append("\n"+"Player "+ two.getPLayerID()+" win the round, and get all the card");
                sub++; 
            }}else if(value1==value2){{
                pw.append("\n Two Player have same card value, start the  War");
                pw.append("\n draw next three cards........");
                pw.append("\n draw the fourth cards..........");
                sub=(sub+4);
                value1=(int) deckValue1.get(sub);
                value2=(int) deckValue2.get(sub);
                pw.append("*****"+one.getPLayerID() + " the fourth card's value: " + value1 + " v/s " + two.getPLayerID() + " the fourth card's value: " + value2+"*****");
                if(value1>value2){
                deckValue1.addLast(deckValue2.get(sub));
                deckValue1.addLast(deckValue2.get(sub-4));
                deckValue1.addLast(deckValue2.get(sub-3));
                deckValue1.addLast(deckValue2.get(sub-2));
                deckValue1.addLast(deckValue2.get(sub-1));
                pw.append("\n"+"Player "+ one.getPLayerID()+" win the round, and get all the card");
                sub++;
                }else{
                deckValue2.addLast(deckValue1.get(sub));
                deckValue2.addLast(deckValue1.get(sub-4));
                deckValue2.addLast(deckValue1.get(sub-3));
                deckValue2.addLast(deckValue1.get(sub-2));
                deckValue2.addLast(deckValue1.get(sub-1));
                pw.append("\n"+"Player "+ two.getPLayerID()+" win the round, and get all the card");
                sub++;
                }
                
            }
            }
        }
        pw.append("\n Game End \n ");
        return printScreen;
    }
    
    
}
