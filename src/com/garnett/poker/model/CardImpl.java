package com.garnett.poker.model;

/**
 * Card implementation class
 * 
 * @author jason.garnett
 *
 */
public class CardImpl implements Card {
	
	private Suit suit;
	private Rank rank;
	
	public CardImpl(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public Rank getRank() {
		return this.rank;
	}

	@Override
	public Suit getSuit() {
		return this.suit;
	}
	
	@Override
	public String toString() {
		return rank.toString() + " OF " + suit.toString(); 
	}
	
	/**
	 * Assume all suits are equal and only compare rank.
	 * 
	 * @param otherCard {@link Card} to compare against
	 * @return
	 */
	public int compareTo(Card otherCard) {
		return rank.ordinal() - otherCard.getRank().ordinal();
	}

}
