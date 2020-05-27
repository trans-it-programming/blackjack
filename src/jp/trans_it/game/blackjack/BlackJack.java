package jp.trans_it.game.blackjack;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		start(scanner);
		scanner.close();
	}

	public static void start(Scanner scanner) {
		Stock stock = new Stock();

		Dealer dealer = new Dealer();
		Player player = new Player(scanner);

		Attender[] attenders = { player, dealer };

		for (int i = 0; i < attenders.length; i++) {
			Attender attender = attenders[i];
			attender.start(stock);
		}
		dealer.display();

		for (int i = 0; i < attenders.length; i++) {
 			Attender attender = attenders[i];
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

