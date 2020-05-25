package jp.trans_it.game.blackjack.test;

import org.junit.jupiter.api.Test;

import jp.trans_it.game.blackjack.Card;
import jp.trans_it.game.blackjack.Stock;

class StockTest {

	@Test
	void testStock() {
		Stock stock = new Stock();
		while(stock.getNumberOfCards() > 0) {
			Card card = stock.pickCard();
			System.out.println(card);
		}
	}

}
