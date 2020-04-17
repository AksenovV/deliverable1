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
    public Deck()
    {
        super();
        Card.Value[] values = {
            Card.Value.Two,
            Card.Value.Three,
            Card.Value.Four,
            Card.Value.Five,
            Card.Value.Six,
            Card.Value.Seven,
            Card.Value.Eight,
            Card.Value.Nine,
            Card.Value.Ten,
            Card.Value.Jack,
            Card.Value.Queen,
            Card.Value.King,
            Card.Value.Ace};
        Card.Suit[] suits = {
            Card.Suit.Spade,
            Card.Suit.Heart,
            Card.Suit.Club,
            Card.Suit.Diamond};
        for (int i = 0; i < values.length; ++i)
        {
            for (int j = 0; j < suits.length; ++j)
            {
                Card card = new Card(suits[j], values[i]);
                this.addCard(card);
            }
        }
        this.shuffle();
    }
    
    public final void shuffle()
    {
        Collections.shuffle(cards);
    }
    public void giveCard(Player player)
    {
        Card card = cards.remove(0);
        player.AddCartToHand(card);
    }
}
