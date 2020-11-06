package days10;

public class Method02 {

	public static void main(String[] args) {
		int [] kor = {98, 59, 87};
		int [] eng = {78, 69, 87};
		int [] mat = {88, 66, 77};
		
		printForm();
		for (int i = 0; i < kor.length; i++) {
			int tot = kor[i] + eng[i] + mat[i];
			double ave = tot / 3.0;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t\n", i+1, kor[i], eng[i], mat[i], tot, ave);
		}
	}
	
	public static void printForm() {
		System.out.println("\t\t### 성적표 ###");
		System.out.println("--------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
	}

}
