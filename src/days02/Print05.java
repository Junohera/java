package days02;

public class Print05 {

	public static void main(String[] args) {
		System.out.println("\t\t###성적표###");
		System.out.println("---------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("1\t홍길동\t\t85\t56\t79\t" + (85+56+79) + "\t" + (85+56+79)/3.0 );
		System.out.println("2\tGildong\t85\t96\t77\t" + (85+96+77) + "\t" + (85+96+77)/3.0 );
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		// println은 소수점 아래 자리수 조절 기능이 없어서 추후 공부할 단원의 내용으로 조치가 필요합니다.
		// 그때까진 소수점출력자리 그대로 사용합니다.
	}

}