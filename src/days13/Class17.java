package days13;

class Sum {
	private int a;
	private int b;
	
	Sum(int a, int b) { this.a = a; this.b = b; }
	
	public int add(int ...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) sum += is[i];
		
		return sum + this.a + this.b;
	}
	
	/*
	public int add() { return this.a + this.b; }
	public int add(int n) { return this.a + this.b + n; }
	public int add(int n, int n2) { return this.a + this.b + n + n2; }
	public int add(int n, int n2, int n3) { return this.a + this.b + n + n2 + n3; }
	*/
}
public class Class17 {
	public static void main(String[] args) {
		Sum s = new Sum(25, 36);
		System.out.println("s.add()의 결과 : " + s.add()); // a + b
		System.out.println("s.add()의 결과 : " + s.add(23)); // 23 + a + b
		System.out.println("s.add()의 결과 : " + s.add(59, 65)); // 59 + 65 + a + b
		System.out.println("s.add()의 결과 : " + s.add(59, 65, 85)); // 59 + 65 + 85 + a + b
	}
}