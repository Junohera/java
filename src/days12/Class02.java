package days12;

class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
}
public class Class02 {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.bun = 1;
		std1.name = "홍길동";
		std1.kor = 89; std1.eng = 87; std1.mat = 93;
		std1.tot = std1.kor + std1.eng + std1.mat;
		std1.ave = std1.tot / 3.0;
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t\t", std1.bun, std1.name);
		System.out.printf("%d\t", std1.kor);
		System.out.printf("%d\t", std1.eng);
		System.out.printf("%d\t", std1.mat);
		System.out.printf("%d\t", std1.tot);
		System.out.printf("%.1f\t", std1.ave);
	}

}
