package jp.trans_it.game.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJack {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in)
		);
		start(reader);
		reader.close();
	}

	public static void start(BufferedReader reader) throws IOException {
		Stock stock = new Stock();

		Dealer dealer = new Dealer();
		Player player = new Player(reader);

		Attender[] attenders = { player, dealer };

		for (Attender attender : attenders) {
			attender.start(stock);
		}
		
		dealer.display();
		
		for (Attender attender : attenders) {
			attender.play(stock);
		}

		showResult(player, dealer);
	}

	public static void showResult(Attender player, Attender dealer) {
		dealer.display();
		player.display();

		int dealerStrength = dealer.calculateStrength();
		int playerStrength = player.calculateStrength();

		if (playerStrength > dealerStrength) {
			System.out.println("あなたの勝ちです!!!");
		} else if (playerStrength < dealerStrength) {
			System.out.println("あなたの負けです。");
		} else {
			System.out.println("引き分けです。");
		}
	}
}

