import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class driver {

	public static void main(String[] args) {
		Card card;
		ArrayList<Card> c = new ArrayList<Card>();
		// TODO Auto-generated method stub
		Card[] cards = {
				new Card(Rank.TEN, Suit.HEARTS),
				new Card(Rank.NINE, Suit.HEARTS), 
				new Card(Rank.SIX, Suit.DIAMONDS),
				new Card(Rank.KING, Suit.CLUBS),
				new Card(Rank.KING, Suit.CLUBS),
				new Card(Rank.ACE, Suit.SPADES)};
		
		for(Card b : cards) {
			c.add(b);
			//System.out.println(c);
		}
		System.out.println(c);
		int compare = c.get(0).compareTo(c.get(1));
		System.out.println(compare);
		Collections.sort(c);
		System.out.println(c);
	 compare = c.get(3).compareTo(c.get(4));
	
	
	System.out.println(compare);
		
		

	}

}
