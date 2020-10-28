package days02;

public class Variable04 {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int mat1, mat2, mat3;
		int tot1, tot2, tot3;
		double ave1, ave2, ave3;
		// 각 점수의 대입
		kor1 = 98; kor2 = 78; kor3 = 98;
		eng1= 87; eng2 = 69; eng3 = 83;
		mat1 = 56; mat2 = 81; mat3 = 73;
		// 총점 계산
		tot1 = kor1 + eng1 + mat1;
		tot2 = kor2 + eng2 + mat2;
		tot3 = kor3 + eng3+ mat3;
		// 평균 계산
		ave1 = tot1 / 3.0;
		ave2 = tot2 / 3.0;
		ave3 = tot3 / 3.0;
		System.out.println("----------------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1\t홍길동\t\t" + kor1 + "\t" + eng1 + "\t" + mat1 + "\t" + tot1 + "\t" + ave1);
		System.out.println("2\tGildong\t" + kor2 + "\t" + eng2 + "\t" + mat2 + "\t" + tot2 + "\t" + ave2);
		System.out.println("3\tHongGil\t" + kor3 + "\t" + eng3 + "\t" + mat3 + "\t" + tot3 + "\t" + ave3);
		System.out.println("----------------------------------------------------------------");
		
		System.out.printf("----------------------------------------------------------------\n");
		System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("----------------------------------------------------------------\n");
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n", 1, "홍길동", kor1, eng1, mat1, tot1, ave1);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", 2, "Gildong", kor2, eng2, mat2, tot2, ave2);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", 3, "shdlfasdf", kor3, eng3, mat3, tot3, ave3);
		System.out.printf("----------------------------------------------------------------");
	}

}
