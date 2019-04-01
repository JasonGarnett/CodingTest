package com.garnett.poker.model.main;

import com.garnett.poker.model.Deck;

/**
 * Basic main class used for testing the poker model classes
 * 
 * 
 * @author jason.garnett
 *
 */
public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		// Print sorted deck
		System.out.println(deck.toString() + "\n***********************\n");
		
		//  Deal 100 cards and print them (making sure only 52 are dealt)
		for (int i = 0; i < 100; i++) {
			System.out.println(deck.dealOneCard());
		}
		
		// Deck is empty, so refill it (I don't know the poker term for this and google wasn't helpful
		deck.replenish();
		
		// Shuffle my newly replenished deck
		deck.shuffle();
		
		// Print the newly sorted deck.
		System.out.println(deck.toString() + "\n***********************\n");
		
				
	}
	
}
