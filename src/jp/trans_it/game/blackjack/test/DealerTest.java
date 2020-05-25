package jp.trans_it.game.blackjack.test;

import org.junit.jupiter.api.Test;

import jp.trans_it.game.blackjack.Dealer;
import jp.trans_it.game.blackjack.Stock;

class DealerTest {

	@Test
	void testDealer() {
		Stock stock = new Stock();
		Dealer dealer = new Dealer();

		dealer.start(stock);
		System.out.println(dealer);

		dealer.play(stock);
		System.out.println(dealer);
	}
}
