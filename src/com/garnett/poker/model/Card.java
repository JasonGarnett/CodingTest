package com.garnett.poker.model;

public class Card {

	public static final int MAX_VALUE = 13;
	protected Suit suit;
	protected Rank rank;
	
	@Override
	public String toString() {
		return rank.toString() + " OF " + suit.toString(); 
	}
	
	public int compareTo(Card otherCard) {
		return 0;
	}
}

enum Suit {
	HEARTS, SPADES, CLUBS, DIAMONDS;
}

enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
	
	Rank (int value) {
		
	}
}