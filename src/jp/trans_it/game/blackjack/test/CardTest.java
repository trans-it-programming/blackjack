package jp.trans_it.game.blackjack.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import jp.trans_it.game.blackjack.Card;

class CardTest {

	@Test
	void test() {
		List<Card> cards = Card.getAllCards();
		for(Card card : cards) {
			System.out.println(card);
		}
	}
}
