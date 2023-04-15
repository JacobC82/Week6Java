package gameOfWar;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

	private List<String> players = List.of("Jake", "John", "Gab", "Sam");
	
	
	
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
//		dealCards();
//		playGame();
//		declareWinner();
	}

private void shuffleDeck() {
		deck = new Deck();
		System.out.println(deck);
	}

//	private void shuffleDeck() {
		// TODO Auto-generated method stub
		
//	}

	private void selectPlayers() {
		List<String> names = new LinkedList<>(players);
		player1 = selectPlayer(names);
		player2 = selectPlayer(names);
		
		System.out.printf("%s is playing %s. %n", player1, player2);
	}
	
	private Player selectPlayer(List<String> names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player(name);
	}

}
