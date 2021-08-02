package jp.trans_it.game.blackjack;

import java.io.BufferedReader;
import java.io.IOException;

public class Player extends Attender {

	public static final int ACTION_HIT = 1;
	public static final int ACTION_STAND = 2;

	private BufferedReader reader;

	public Player(BufferedReader reader) {
		super("You");
		this.reader = reader;
	}

	@Override
	public int calculateStrength() {
		int strength = super.calculateStrength();
		if(strength == 0) {
			strength = -1;
		}
		return strength;
	}

	@Override
	public void play(Stock stock) throws IOException {
		boolean standing = false;
		while(!standing) {
			this.display();
			int action = selectAction();
			if(action == ACTION_HIT) {
				this.hit(stock);
				int strength = this.calculateStrength();
				if(strength <= 0) {
					standing = true;
				}
			}
			else {
				standing = true;
			}
		}
	}

	private int selectAction() throws IOException {
		String selectMessage = "[" + ACTION_HIT + "] Hit (カードを引く) "
				               + "    [" + ACTION_STAND + "] Stand (勝負する)";
		System.out.println(selectMessage);
		int action = 0;
		while(action != ACTION_HIT && action != ACTION_STAND) {
			String input = this.reader.readLine();
			action = Integer.parseInt(input);
		}
		return action;
	}
}
