package gameOfWar;

//import java.util.ArrayList;
//import java.util.List;

public class Card {
	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " of " + suit;
	}
	
}
