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
    public Hand()
    {
        super();
    }
    public String showCards()
    {
        String ans = "";
        for (int i = 0; i < getSize(); ++i)
        {
            Card tmp = cards.get(i);
            ans += tmp;
            ans += '\n';
        }
        return ans;
    }
    public int handSum()
    {
        int sum = 0;
        for (int i = 0; i < getSize(); ++i)
        {
            Card tmp = cards.get(i);
            sum += tmp.getIntValue();
        }
        return sum;
    }
}
