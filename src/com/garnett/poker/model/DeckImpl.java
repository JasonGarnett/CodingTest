package com.garnett.poker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Poker Deck implementation class
 * 
 * @author jason.garnett
 *
 */
public class DeckImpl implements Deck {
	private List<Card> cards;
	private Random rand;
	private PokerBuilder builder;
	
	public DeckImpl() {
		
		this.builder = PokerBuilder.getInstance();
		this.rand = new Random();
		
		replenish();
	}
	
	/**
	 * Refills the deck with new cards.
	 */
	public void replenish() {
		cards = new ArrayList<>();
		
		for (Suit suit: Suit.values()) {
			for (Rank rank: Rank.values()) {
				cards.add(builder.buildCard(suit, rank));
			}
		}
	}
	
	/**
	 * Pick a random {@link Card} in the deck, remove it and insert it to the end of a new
	 * list of cards, swap the "old" list for the "new" list of cards.
	 * 
	 */
	@Override
	public void shuffle() {
		List<Card> sortedCards = new ArrayList<>();
		while (cards.size() > 0) {
			int newPos = rand.nextInt(cards.size());
			Card card = cards.remove(newPos);
			sortedCards.add(card);
		};
		cards = sortedCards;
	}
	
	/**
	 * Returns a {@link Card} object, removing it from the deck.
	 * 
	 * @return returns The {@link Card} being dealt 
	 */
	@Override
	public Card dealOneCard() {
		if (cards.size() > 0)
			return cards.remove(0);
		else
			return null;
	}
	
	/**
	 * Returns the number of cards remaining in the deck.
	 * 
	 * @return number of cards remaining in the deck
	 */
	@Override
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
