/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    protected ArrayList <Card> cards;
    
    public GroupOfCards()
    {
        cards = new ArrayList<Card>();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    
    public void addCard(Card card)
    {
        cards.add(card);
    }
    
}//end class
