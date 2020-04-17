/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author vlado
 */
public class Main {
    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        Game game = new Game("BlackJack", gameDeck);
        game.Start();
    }
}
