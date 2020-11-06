package days10;

public class Method04 {

	public static void main(String[] args) {
		int [] kor = {98, 59, 87};
		int [] eng = {78, 69, 87};
		int [] mat = {88, 66, 77};
		
		printForm();
		for (int i = 0; i < kor.length; i++) {
			printScore(kor[i], mat[i], eng[i], i);
			// 매개변수에 전달하는 값은 실제 값을 쓸수도 있고, 위처럼 변수를 써서 변수에 담긴 값을 전달할 수도 있습니다.
		}
	}
	
	public static void printScore(int k, int m, int e, int b) {
		// 매개변수의 이름은 전달되는 값의 변수이름과 반드시 같을 필요는 없습니다.
		int tot = k + m + e;
		double ave = tot / 3.0;
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t\n", b+1, k, e, m, tot, ave);
	}
	
	public static void printForm() {
		System.out.println("\t\t### 성적표 ###");
		System.out.println("--------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
	}

}
