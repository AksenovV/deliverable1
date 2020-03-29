/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Collections;

/**
 *
 * @author vlado
 */
public class Deck extends GroupOfCards{
    public Deck(int sz)
    {
        super(sz);
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    public void giveCard(Player player)
    {
        
    }
}
