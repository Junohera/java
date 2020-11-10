package days12;

class Account {
	double balance; // 잔액 정보를 저장할 멤버필드
	
	public void display() {System.out.printf("현재 잔액은 %.2f원 입니다.\n", balance);}
	public void initBanance(int p) {balance = p;}
	public void withraw(int p) {balance -= p;}
	public void deposit(int p) {balance += p;}
}
public class Class05 {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.initBanance(10000); // 잔액 초기화메서드
		a.display(); // 현재 잔액을 화면에 출력하는 메서드
		a.withraw(5000); // 출금
		a.display();
		a.deposit(20000); // 입금
		a.display();
		// 클래스의 멤버필드/메소드는 접근지정자(private, protected, public)에 의해서 외부에서의 접근을 제어합니다.
		// 접근지정자를 사용하지 않는 경우 기본지정으로 public이 설정되며 아래와 같이 임의의 값으로
		// 멤버필드의 값이 임의로 수정될 수 있습니다.
		a.balance += 5000;
		// private 은 자기자신 class의 멤버 메서드에서만 접근 가능합니다.
		// 따라서 만약 balance가 private으로 지정되면 아래 명령들은 모두 에러입니다.
		// a.balance = 50000; // 에러
		// System.out.printf("현재 잔액은 %.2f원 입니다.\n", a.balance); //에러
		
		// 결국 private 으로 지정된 멤버 필드는 같은 클래스내의 멤버 메서드를 이용해야지만 값을 변경하거나
		// 얻어 올 수 있습니다.
	}

}
