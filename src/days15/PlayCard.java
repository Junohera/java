package days15;

class Deck {
	Card[] cards = new Card[52];

	public Deck() {
		int k = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 14; j++) {
				cards[k] = new Card(i, j); // 4회, 13회가 중복 설정된 반복문에 의해 52번 객체 생성
				// 생성된 객체의 주소는 52개의 레퍼런스 값들을 저장할 배열에 한칸씩 주소 전달
				k++;
			}
		}
	}

	public void shuffle() {
		Card temp;
		for (int i = 0; i < 52; i++) {
			int r = (int) (Math.random() * 52); // 0~51 사이의 랜덤한 정수 생성
			temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}

}

public class PlayCard {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();

		Card[] p1 = new Card[5];
		Card[] p2 = new Card[5];
		Card[] p3 = new Card[5];
		Card[] p4 = new Card[5];

		int count = 0;
		for (int i = 0; i < 5; i++) {
			p1[i] = d.cards[count++];
			p2[i] = d.cards[count++];
			p3[i] = d.cards[count++];
			p4[i] = d.cards[count++];
		}
		
		for(int i = 0; i < 5; i++) System.out.printf("%s ",  p1[i].toString());
		System.out.println();
		for(int i = 0; i < 5; i++) System.out.printf("%s ",  p2[i].toString());
		System.out.println();
		for(int i = 0; i < 5; i++) System.out.printf("%s ",  p3[i].toString());
		System.out.println();
		for(int i = 0; i < 5; i++) System.out.printf("%s ",  p4[i].toString());
		System.out.println();
	}

}
