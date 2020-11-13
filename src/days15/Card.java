package days15;

public class Card {
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	
	int kind;
	int number;

	public Card(int kind, int number) {
		this.kind = kind; this.number = number;
	}
	public Card() {
		this(spade, 1);
	}
	public String toString() {
		String [] kinds = {"", "Clover", "Heart", "Diamond", "Spade"};
		String [] numbers = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		return "[" + kinds[this.kind] + ":" + numbers[this.number] + "]";
		// kind이 4, number:13이라면 만들어지고 리턴될 문자열 "[Spade:K]";
	}
}
