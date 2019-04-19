package content;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Game {

    LinkedList<Player> playerInfo = new LinkedList();
    private String gameName = new String();

    public Game(String gameName, LinkedList playerList) {
        this.gameName = gameName;
        playerInfo = playerList;
    }

    public abstract PrintWriter runGame(PrintWriter pw);
        
}

