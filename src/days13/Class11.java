package days13;
/*
 * 클래스 이름 : Complex
 * 멤버 변수 : image(int)-허수부, real(int)-실수부
 * 멤버 메서드 : getter, setter, add() - 두 복소수간의 합, init() - 복소수 값 초기화, prn() - 복소수 출력(3+7i)형식
 */

class Complex {
	private int imageWhenFirst;
	private int realWhenFirst;
	private int image;
	private int real;
	
	public void init(int real, int image) {
		this.real = real;
		this.realWhenFirst = real;
		
		this.image = image;
		this.imageWhenFirst = image;
	}
	
	public void prn() {
		System.out.println(this.real + " + " + this.image + "i");
	}
	
	public void prnFirst() {
		System.out.println("when init : " + this.realWhenFirst + " + " + this.imageWhenFirst + "i");
	}
	
	public void add(Complex another) {
		this.real += another.real;
		this.image += another.image;
	}
	
	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
		if (image != 0 && this.imageWhenFirst == 0) {
			this.imageWhenFirst= image;
		}
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
		if (real != 0 && this.realWhenFirst == 0) {
			this.realWhenFirst = real;
		}
	}
}

public class Class11 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.init(3, 6);
		c2.setReal(5);
		c2.setImage(4);
		c1.add(c2);
		c1.prn(); // 8 + 10i 출력
		c2.prn(); // 5 + 4i 출력
		
		c1.prnFirst();
		c2.prnFirst();
	}

}
