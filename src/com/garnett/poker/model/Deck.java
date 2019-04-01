package com.garnett.poker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cards;
	private Random rand;
	
	public Deck() {
		
		replenish();
		
		rand = new Random();
	}
	
	public void replenish() {
		cards = new ArrayList<>();
		
		for (Suit suit: Suit.values()) {
			for (Rank rank: Rank.values()) {
				cards.add(new NumberCard(suit, rank));
			}
		}
	}
	
	public void shuffle() {
		cards.forEach(card -> {
			int newPos = rand.nextInt(cards.size()-1);
			
		});
	}
	
	public Card dealOneCard() {
		if (cards.size() > 0)
			return cards.remove(0);
		else
			return null;
	}
	
	public int getNumberOfRemainingCards() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		StringBuilder retVal = new StringBuilder();
		cards.forEach(card -> retVal.append(card.toString()).append("\n"));
		
		return retVal.toString();
	}

}
