package days01;

public class ForthJava {

	public static void main(String[] args) {
	/*
	 	\b 		: 백스페이스
	 	\'		: 작은 따옴표 출력	
	 	\"		: 큰 따옴표 출력	
	 	%%	: % 출력
	 	\\		: 역슬래쉬 출력 	*/
		System.out.printf("대통령은 조약을 \"체결-비준\"하고,\n");
		// 큰따옴표를 화면에 직접 출력하면 \" 라고 써야 큰따옴표만 출력됩니다.
		// System.out.printf 명령의 ("~") 안에서 "를 출력할 때 \가 없으면
		// 끝나는 큰따옴표로 인식되어 오류가 생깁니다.
		System.out.printf("외교사절을 \"신임-접수\" 또는 \"파견\"하며, \n");
		System.out.printf("\'선전포고\'와 \'강화\'를 한다.\n\n");
		System.out.printf("대통령의 임기가 만료되는 때에는 \n");
		System.out.printf("임기만료 70%% 내지 40%% 전에 후임자를 선거한다.");
		// %또한 두개를 써야 별도용도의 이스케이프 문자로 인식되지 않고 %하나가 출력됩니다.
	}

}
