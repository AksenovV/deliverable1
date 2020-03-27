/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author vlado
 */
public class Hand extends GroupOfCards{
    public Hand(int sz)
    {
        super(sz);
    }
    public ArrayList<Card> showCards()
    {
        return cards;
    }
}
