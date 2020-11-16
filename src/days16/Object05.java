package days16;

import java.util.Vector;

// 부모 클래스의 레퍼런스 변수에 자식클래스 인스턴스 주소를 저장하여 사용하거나
// 저장햇다가 자식형으로 다시 되돌려서 사용하는 예제
// 상속한 부모클래스가 없다면 Object 클래스가 부모클래스가 되어 인스턴스주소를 저장했다가
// 다시 자식형으로 되돌려서 사용하는 예제
class Product { // 상품이라고 인식되고 사용되어질 부모클래스
	int price;
	int bonusPoint;
	Product(int p) { this.price = p; this.bonusPoint = p/10; }
}
class Computer extends Product {
	Computer() { super(150); } // 생성자
	public String toString() {return "Computer"; } // 오버라이딩 된 toString
}
class Tv extends Product {
	Tv() { super(100); } // 생성자
	public String toString() { return "Tv"; } // 오버라이딩 된 toString
}
class Audio extends Product {
	Audio() { super(60); } // 생성자
	public String toString() { return "Audio"; } // 오버라이딩 된 toString
}
class Buyer { // 구매자용 클래스
	int money = 1000; // 구매자가 지참하고 있는 잔액
	int bonusPoint = 0; // 물건을 사고 얻는 누적 보너스 포인트 값
	Vector item = new Vector(); // 구매한 물건의 리스트
	// 백터란 배열의 확장형 리스트 구조 - 객체들을 저장할 수 있는 배열이라고 이해해도 무방함
	// 사용자가 만든 클래스의 객체(메모리를 할당받은 레퍼런스값)등이 저장되는 다형성 개체 저장 리스트입니다.
	
	/*public void buy(Tv t) {}
	public void buy(Computer c) {}
	public void buy(Audio a) {}*/
	
	public void buy(Product p) { // this <- b(buyer) p <- 컴퓨터, TV, 오디오 중 하나의 상품
		// 1. money -= price
		if (this.money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		this.money -= p.price;
		// 2. bonusPoint += bonusPoint
		
		this.bonusPoint += p.bonusPoint;
		// 3. item(Vector형 변수)에 추가
		System.out.println(p + "을 구입하셨습니다.");
		this.item.add(p); // Vector 클래스의 멤버 method public void add(Object obj) {}
	}
	public void summary() {
		// 구매내역 및 지출내역
		int sum = 0; // 지출총액을 저장할 변수
		String itemList = ""; // 구매목록을 저장할 변수
		if (item.isEmpty()) { // item.isEmpty() : Vector 객체인 item이 비어있으면 true리턴
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		// Vector 객체에서 저장된 요소를 하나씩 꺼내오는 method이름 .get(저장요소의 번호 : 0번이 처음);
		for (int i = 0; i < item.size(); i++) { // item.size()에 저장된 요소의 갯수
			Product p = (Product)item.get(i);
			// Object로 저장된걸 꺼내면 다시 Product형으로 캐스팅해야 멤버들을 사용할 수 있습니다.
			sum += p.price;
			itemList += " " + p;
		}
		System.out.println("지출총액 : " + sum + ", 구매목록 : " + itemList);
	}
	public void refund(Product p) {
		// 1. 리스트에서 전달된 객체를 검색
		// 		1. money += price;
		//		2. bonusPoint -= bunosPoint;
		//		3. item에서 삭제
		if (item.remove(p)) { // item.remove(p) : item에서 p를 삭제 - remove하려는 p가 존재하여 잘 지워졌다면 true 리턴
			money += p.price; // 바이어 소지 잔액에 상품 가격합산
			bonusPoint -= p.bonusPoint; // 보너스 포인트 차감
			System.out.println(p + "을/를 반품하셨습니다.");
		} else { // item.remove(p) : remove하려는 p가 목록에 없다면 false 리턴
			System.out.println("구입하신 물품중에 해당 제품이 없습니다.");
		}
	}
}
public class Object05 {
	public static void main(String[] args) {
		// 각 클래스별 객체 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		Buyer b = new Buyer();
		
		b.buy(t1);
		b.buy(c);
		b.buy(a);
		
		b.summary();
		
		b.buy(t2);
		b.summary();
		b.refund(t1);
		b.summary();
	}
}
