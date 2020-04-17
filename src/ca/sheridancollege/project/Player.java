/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player 
{
    private String playerId; //the unique ID for this player
    private Hand playerHand;
    private boolean isHuman;
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name, boolean flag)
    {
        playerId= name;
        isHuman = flag;
        playerHand = new Hand();
    }
    public boolean isHuman()
    {
        return isHuman;
    }
    /**
     * @return the playerID
     */
    public String getPlayerId() 
    {
        return playerId;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenId the playerID to set
     */
    public void setPlayerID(String givenId) 
    {
        playerId = givenId;
    }
    public void AddCartToHand(Card card)
    {
        playerHand.addCard(card);
    }
    public String showHand()
    {
        String ans = "Your hand is filled with:\n" + playerHand.showCards();
        return ans;
    }
    /**
     * previously play, but since choice is being made by user in game, that was replaced to the AI choice.
     */
    public boolean isGoingToHit()
    {
        int sum = playerHand.handSum();
        if (sum < 17)
            return true;
        return false;
    }
    public boolean isWin()
    {
        if (playerHand.handSum() == 21) return true;
        return false;
    }
    public boolean isLose()
    {
        if (playerHand.handSum() > 21) return true;
        return false;
    }
    public int sum()
    {
        return playerHand.handSum();
    }
}
