package jp.trans_it.game.blackjack;

public enum Suit {
	
	SPADE("スペード"),
	HEART("ハート"),
	DIAMOND("ダイヤ"),
	CLUB("クラブ");

	private String name;
	private Suit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
