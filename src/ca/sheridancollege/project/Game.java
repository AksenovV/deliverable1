/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class Game 
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    private Deck mDeck;
    
    public Game(String givenName, Deck usedDeck)
    {
        gameName = givenName;
        mDeck = usedDeck;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public void addPlayer(Player player)
    {
        players.add(player);
    }
    public void Start()
    {
        System.out.println("Welcome, you are playing " + getGameName());
        addPlayer(new Player("AI", false));
        addPlayer(new Player("Player", true));
        boolean isAIDone = false, isPlayerDone = false, isOver = false;
        int playerNumber = 0;
        mDeck.giveCard(players.get(0));
        mDeck.giveCard(players.get(1));
        mDeck.giveCard(players.get(0));
        mDeck.giveCard(players.get(1));
        while(!isAIDone || !isPlayerDone)
        {
            Player current = players.get(playerNumber);
            if (current.isHuman() == false)
            {
                if (isAIDone) continue;
                if (current.isGoingToHit())
                {
                    mDeck.giveCard(current);
                    System.out.println("AI choosed to hit\n");
                }
                else
                {
                    isAIDone = true;
                    System.out.println("AI choosed to stay\n");
                }
            }
            else
            {
                if (isPlayerDone) continue;
                boolean goodData = false;
                while(!goodData) {
                    System.out.println("Your turn");
                    System.out.println(current.showHand());
                    System.out.println("Choose option:\n1:hit\n2:stay");
                    Scanner sc = new Scanner(System.in);
                    String ans = sc.nextLine().trim();
                    switch(ans) {
                        case "1":
                        goodData=true;
                        mDeck.giveCard(current);
                        break;
                        case "2":
                        goodData=true;
                        isPlayerDone = true;
                        break;
                    }
                }
                
            }
            if (current.isWin())
            {
                isOver = true;
                if (current.isHuman())
                {
                    System.out.println("Player wins!");
                    displayInfo();
                    break;
                }
                else
                {
                    System.out.println("AI wins!");
                    displayInfo();
                    break;
                }
            }
            if (current.isLose())
            {
                isOver = true;
                if (current.isHuman())
                {
                    System.out.println("Player busted, AI wins!");
                    displayInfo();
                    break;
                }
                else
                {
                    System.out.println("AI busted, Player wins!");
                    displayInfo();
                    break;
                }
            }
            playerNumber++;
            playerNumber %= players.size();
        }
        if (!isOver) declareWinner();
    }
    
    public void declareWinner()
    {
        if (players.get(0).sum() > players.get(1).sum())
        {
            if (players.get(0).isHuman())
            {
                System.out.println("Player wins!");
                displayInfo();
            }
            else
            {
                System.out.println("AI wins!");
                displayInfo();
            }
        }
        else if (players.get(0).sum() < players.get(1).sum())
        {
            if (players.get(0).isHuman())
            {
                System.out.println("AI wins!");
                displayInfo();
            }
            else
            {
                System.out.println("Player wins!");
                displayInfo();
            }
        }
        else
        {
            System.out.println("Draw");
            displayInfo();
        }
    }
    void displayInfo()
    {
        System.out.println("First player sum: " + players.get(0).sum());
        System.out.println("Second player sum: " + players.get(1).sum());
    }
}//end class
