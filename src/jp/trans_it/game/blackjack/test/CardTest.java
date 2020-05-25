package jp.trans_it.game.blackjack.test;

import org.junit.jupiter.api.Test;

import jp.trans_it.game.blackjack.Card;

class CardTest {

	@Test
	void test() {
		Card[] cards = Card.getAllCards();
		for(int i = 0; i < cards.length; i++) {
			Card card = cards[i];
			System.out.println(card);
		}
	}
}
