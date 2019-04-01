package com.garnett.poker.model;

/**
 * Interface class for the Deck
 * 
 * @author jason.garnett
 *
 */
public interface Deck {
	

	
	/**
	 * Refills the deck with new cards.
	 */
	public void replenish();
	
	/**
	 * Pick a random {@link Card} in the deck, remove it and insert it to the end of a new
	 * list of cards, swap the "old" list for the "new" list of cards.
	 * 
	 */
	public void shuffle();
	
	/**
	 * Returns a {@link Card} object, removing it from the deck.
	 * 
	 * @return returns The {@link Card} being dealt 
	 */
	public Card dealOneCard();
	
	/**
	 * Returns the number of cards remaining in the deck.
	 * 
	 * @return number of cards remaining in the deck
	 */
	public int getNumberOfRemainingCards();
	
}
