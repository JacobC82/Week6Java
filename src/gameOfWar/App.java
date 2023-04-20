package gameOfWar;

import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class App {
	
	private final List<String> players = List.of("Jake", "John", "Gab", "Sam");
	
	
	
	private Random random = new Random();
	
	private Player player1;
	private Player player2;
	private Deck deck;
	
	public static void main(String[] args) {
		new App().run();		
	}

	private void run() {
		
		selectPlayers();
		shuffleDeck();
		dealCards();
		playGame();
		declareWinner();
	}
	
	// determines winner through an if statement and prints out results of the game by calling on the appropriate method
	private void declareWinner() {
    	if(player1.getScore() > player2.getScore()) {
    		printWinner(player1);
    		printLoser(player2);
      }
    	else if(player2.getScore() > player1.getScore()) {
    		printWinner(player2);
    		printLoser(player1);
      }
    	else {
    		printTie(player1, player2);
      }
    	
	}

	private void printTie(Player player1, Player player2) {
		System.out.println(player1.getName() + " and " + player2.getName() + " have finished with a tie!");
	}

	private void printLoser(Player loser) {
		System.out.println(loser + " has lost with a score of " + loser.getScore() + ".");
	}

	private void printWinner(Player winner) {
		System.out.println(winner + " has won the game with a score of " + winner.getScore() + "!");
	}
	
	// plays the game the length of the list hand (26)
	private void playGame() {
		int numTurns = player1.getHand().size();

		for(int turn = 0; turn < numTurns; turn++) {
			flipCard();
		}

	}
	// game play and results of round and calls the describe method to the card drawn for each player
	private void flipCard() {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
	if(card1.getValue() > card2.getValue()) {
		player1.incrementScore();
		System.out.println(" " );
		System.out.println(player1 + " has drawn " + card1.describe() + " and now has: " + player1.getScore() + " points!");
		System.out.println(player2 + " has drawn " + card2.describe() + " and still has: " + player2.getScore() + " points..");
		System.out.println("_____________________________________________________");
	}
	else if(card2.getValue()> card1.getValue()) {
		player2.incrementScore();
		System.out.println(" ");
		System.out.println(player2 + " has drawn " + card2.describe() + " and now has: " + player2.getScore() + " points!");
		System.out.println(player1 + " has drawn " + card1.describe() + " and still has: " + player1.getScore() + " points..");
		System.out.println("_____________________________________________________");
		}
	
	}
	//distributes elements of the list of deck evenly between two players
	private void dealCards() {
		int size = deck.size();
	
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
		}
			else {
				player2.draw(deck);
		}
	}// fills out each players hand with the describe method called to each player
			player1.describe();
			player2.describe();
	
}
	// calling shuffle method on the deck
	private void shuffleDeck() {
		deck = new Deck();
		deck.shuffle();
}
	// generating random players from list of players
	private void selectPlayers() {
		List<String> names = new LinkedList<>(players);
		player1 = selectPlayer(names);
		player2 = selectPlayer(names);
		
		System.out.printf("%s is playing %s in the card game war!",  player1 , player2);
		System.out.println(" ");
		System.out.println(" " );
		System.out.println("Let the games begin!!");
		System.out.println(" " );
	}
	
	private Player selectPlayer(List<String> names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player(name);
	}

}
