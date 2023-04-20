package gameOfWar;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class AbstractCardList extends LinkedList<Card>{
	public void describe() {
		System.out.println(this);
	}

@Override
public String toString() {
	StringBuilder result = new StringBuilder();
	String lf = System.lineSeparator();
	
	String name = this.getClass().getSimpleName();
	
	result.append(name).append(": ").append(lf);
	// describes each card of the hand
	for (int pos = 0; pos < this.size(); pos++) {
		String space = " ";
		Card card = this.get(pos);
		//System.out.println(card);
		result.append(space).append(card.describe()).append(lf);
	
	}
	return result.toString();
  }// end of toString()
}//end of class