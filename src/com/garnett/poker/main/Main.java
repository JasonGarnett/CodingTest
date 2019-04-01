package com.garnett.poker.main;

import com.garnett.poker.model.Card;
import com.garnett.poker.model.Deck;
import com.garnett.poker.model.PokerBuilder;

/**
 * Basic main class used for testing the poker model classes
 * 
 * 
 * @author jason.garnett
 *
 */
public class Main {

	private static String lineSeparator(String title) {
		return "\n************ " + title + " ***********\n";
	}
	
	public static void main(String[] args) {
		
		PokerBuilder builder = PokerBuilder.getInstance();
		
		Deck deck = builder.buildDeck();
		
		// Print sorted deck
		System.out.println(lineSeparator("PRINT WHOLE UNSORTED DECK") + deck.toString());
		
		//  Deal 100 cards and print them (making sure only 52 are dealt)
		System.out.println(lineSeparator("PRINT WHOLE UNSORTED DECK AND TRY TO OVERFLOW"));
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ") " + deck.dealOneCard());
		}
		
		// Deck is empty, so refill it (I don't know the poker term for this and google wasn't helpful
		deck.replenish();
		
		// Shuffle my newly replenished deck
		deck.shuffle();
		
		// Print the newly sorted deck.
		System.out.println(lineSeparator("PRINT WHOLE SHUFFLED DECK") + deck.toString());
		
		// Testing compareTo
		Deck deck2 = builder.buildDeck();
		deck2.shuffle();
		System.out.println(lineSeparator("COMPARE ALL CARDS IN 2 SHUFFLED DECKS"));
		
		for (int i = 0; i < 52; i++) {
			Card card1 = deck.dealOneCard();
			Card card2 = deck2.dealOneCard();
			
			System.out.println(i + ") " + card1.toString() + "||" + card2.toString() + "::" + card1.compareTo(card2));
		}
		
				
	}
	
}
