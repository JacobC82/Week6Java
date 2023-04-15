package gameOfWar;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")

public class Deck extends LinkedList<Card>{

	private List<String> cardNames = List.of("Two","Three","Four","Five","Six","Seven",
			"Eight","Nine","Ten","Jack","Queen","King","Ace");
	
	private List<String> suits = List.of("Clubs","Diamonds","Hearts","Spades");
	
	//private int startValue = 2;

	private int values;
	
	public Deck() {
		for(int values = 4; values < cardNames.size() + 1 ; values++);{
			String cardName = cardNames.get(values);
			generateCardsForPlayer(values, cardName);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String lf = System.lineSeparator();
		String space = " ";
		result.append(getClass().getSimpleName()).append(": ").append(lf);
		
		for (Card card : this) {
			result.append(space).append(card).append(lf);
		}
		return result.toString();
	}

	private void generateCardsForPlayer(int values, String cardName) {
			for (String suit : suits) {
				add(new Card (cardName, suit, values));
			}
	}

}//end of class
