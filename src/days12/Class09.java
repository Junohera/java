package days12;
/*
 * 멤버method의 주된 목적은 멤버변수의 값을 세팅하거나 얻어오거나... 둘의 목적이 가장 큽니다
 * 때문에 멤버method를 별도의 사유가 없어도 멤버변수에 따라 필요한 만큼 만들고 시작하는 경우가 많습니다.
 * method의 이름은 setter와 getter라는 이름을 사용하는 두개의 method입니다.
 */
class GetSetTest {
	private int num;
	private double dou;
	private String str;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDou() {
		return dou;
	}
	public void setDou(double dou) {
		this.dou = dou;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	/*public void initNum(int n) {
		num = n;
	}
	
	public int getNum() {
		return num;
	}*/
	// 멤버 변수가 하나 만들어지면, 그 변수에 값을 세팅할 수 있는 method와 값을 얻어 낼 수 있는 method를 생성해서 사용합니다.
	// getter method와 setter method는 멤버 변수에 값을 넣거나 얻기 위한 기본도구로 활용됩니다.
	// 멤버 변수의 갯수가 많으면 getter method와 setter method도 많아 집니다.
	// 이를 위해 이클립스에서 getter 와 setter를 자동 생성하는 명령을 제공합니다.
	
	// 현재 위치에서 마우스 오른쪽 버튼 클릭 -> Source -> Generate getters and setters 클릭
}
public class Class09 {

	public static void main(String[] args) {
		GetSetTest g = new GetSetTest();
		g.setNum(30);
		System.out.println(g.getNum());
	}

}
