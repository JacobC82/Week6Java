package gameOfWar;

import java.util.List;

public class Player {
	private String name;
	Hand hand = new Hand();
	private int score;
	
	public Player(String name) {
	this.name = name;
	}

	public String getName() {
		return name;
	}
	// draws first element from list of deck and adds to hand
	public void draw(Deck deck) {
		getHand().add(deck.draw());
		
	}
	
	  @Override
	public String toString() {
	    return name;
	  }
	  
	public void describe() {
		    StringBuilder result = new StringBuilder();

		    result.append("Player ").append(name).append("'s ").append(hand);
		   // for(Card card : getHand()) {
		    //}
		    System.out.println(result);
		  }

	
	public List<Card> getHand() {
		    return hand;
		  }

	// removes first element from list of hand to put the card into play
	public Card flip() {
		return hand.remove();
	}

	
	// increments the score for the winner
	public int incrementScore() {
		return score = getScore() + 1;
		
	}

	public int getScore() {
		return score;
	}

	

}

