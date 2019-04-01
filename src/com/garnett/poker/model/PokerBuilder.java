package com.garnett.poker.model;

/**
 * Builder singleton for building {@link DeckImpl} and {@link CardImpl} classes.
 * 
 * @author jason.garnett
 *
 */
public class PokerBuilder {

	private static PokerBuilder instance = new PokerBuilder();
	
	private PokerBuilder() {}
	
	/**
	 * Returns the Singleton instance
	 * 
	 * @return the instance
	 */
	public static PokerBuilder getInstance() {
		return instance;
	}
	
	/**
	 * Builds the Deck
	 * 
	 * @return a new {@link Deck}
	 */
	public Deck buildDeck() {
		return new DeckImpl();
	}
	
	/**
	 * Builds a card of the correct suit and rank
	 * 
	 * @param suit suit of the card
	 * @param rank rank of the card
	 * @return a new {@link Card}
	 */
	public Card buildCard(Suit suit, Rank rank) {
		return new CardImpl(suit, rank);
	}
	
}
