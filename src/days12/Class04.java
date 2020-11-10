package days12;

class Std {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	void init(int input_bun, String input_name, int input_kor, int input_eng, int input_mat) {
		bun = input_bun;
		name = input_name;
		kor = input_kor;
		eng = input_eng;
		mat = input_mat;
		
		tot = kor + eng + mat;
		ave = tot / (double)3;
	}
	
	void prn() {
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t\t", bun, name);
		System.out.printf("%d\t", kor);
		System.out.printf("%d\t", eng);
		System.out.printf("%d\t", mat);
		System.out.printf("%d\t", tot);
		System.out.printf("%.1f\t", ave);
	}
}
public class Class04 {
	public static void main(String[] args) {
		Std std1 = new Std();
		std1.init(1,  "홍길동", 56, 87, 98); // 멤버필드에 각 값을 저장, 총점 평균 계산
		std1.prn(); // 제목에 맞춰 출력
		
	}
}
