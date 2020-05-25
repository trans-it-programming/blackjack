package jp.trans_it.game.blackjack.test;

import org.junit.jupiter.api.Test;

import jp.trans_it.game.blackjack.Attender;
import jp.trans_it.game.blackjack.Stock;

class AttenderTest {

	@Test
	void testStrength() {
		Stock stock = new Stock();
		Attender attender = new Attender("Test") {
			@Override
			public void play(Stock stock) {
			}
		};


		for(int i = 0; i < 5; i++) {
			if(i == 0) {
				attender.start(stock);
			}
			else {
				attender.hit(stock);
			}
			int strength = attender.calculateStrength();
			System.out.println(attender);
			System.out.println("Strength = " + strength);
		}
	}
}
