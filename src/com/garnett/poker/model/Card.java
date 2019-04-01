package com.garnett.poker.model;
/**
 * Card interface class
 * 
 * @author jason.garnett
 *
 */
public interface Card {
	
	/**
	 * 
	 * @return {@link Rank} of the card
	 */
	public Rank getRank();
	
	/**
	 * 
	 * @return {@link Suit} of the card
	 */
	public Suit getSuit();
	
	/**
	 * Compares 2 {@link Card}s
	 * 
	 * @param otherCard The other card to compare to
	 * @return 0 if the Ranks are equal, negative if the passed in card is higher, positive if the passed in card is lower
	 */
	public int compareTo(Card otherCard);
	
}

enum Suit {
	HEARTS, SPADES, CLUBS, DIAMONDS;
}

enum Rank {
	TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

}