package gameOfWar;

import java.util.List;
import java.util.Random;

@SuppressWarnings("serial")
public class Deck extends AbstractCardList{

	// giving the list a name and suit
	private final List <String> cardNames = List.of("Two","Three","Four","Five","Six","Seven",
			"Eight","Nine","Ten","Jack","Queen","King","Ace");
	
	private List<String> suits = List.of("Clubs","Diamonds","Hearts","Spades");
	

	// 
	public Deck() {
	
	// giving the cards their values	
		for(int cardValue = 0; cardValue < cardNames.size()-1; cardValue++) {
			int value = cardValue;
			String cardName = cardNames.get(value);
			generateCardsForPlayer(value, cardName);
		}
	}
	// populating the deck
    private void generateCardsForPlayer(int value, String cardName) {
		for (String suit : suits) {
			add(new Card(cardName, suit, value));
		}
	}


	// takes the first element in a list and switches positions with a random element within
    // the limits of the size of the list 
	public void shuffle() {
		  Random random = new Random();
		  
		  for (int cardPos = 0; cardPos < this.size(); cardPos++) {
			  		int swapPos = random.nextInt(this.size());
			  		
			  		Card card = this.get(cardPos);
			  		this.set(cardPos, this.get(swapPos));
			  		this.set(swapPos,card);
		  }
	 }
	// removes ("turns over") the first element in the list
	public Card draw() {
		//hand = this.remove()  
		return this.remove();
	  }

}//end of class
