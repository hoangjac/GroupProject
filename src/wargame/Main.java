package wargame;

import content.Game;
import content.GroupOfCard;
import content.Player;
import content.Player1;
import content.Player2;
import content.Rungame;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        LinkedList<Player> playerList=new LinkedList();
        
        System.out.println("This is WAR card game");
        
        System.out.println("Enter your match name: "); 
        Rungame gameRun=new Rungame(k.nextLine(), playerList);
        
        System.out.println("Player 1 name: ");
        Player1 one = new Player1(k.nextLine());
        one.setPlayerDeck();
        playerList.add(one);
        
        System.out.println("Player 2 name: ");
        Player2 two=new Player2(k.nextLine());
        two.setPlayerDeck();
        playerList.add(two);
        
        System.out.println("Player "+ one.getPLayerID()+" deck of card is: " + one.printPlayerDeck());     
        System.out.println("Player "+ two.getPLayerID()+" deck of card is: " + two.printPlayerDeck());
       
        PrintWriter pw=new PrintWriter(System.out);
        gameRun.runGame(pw);
        pw.flush();
        
    }

}
