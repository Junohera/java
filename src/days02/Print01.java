package days02;

public class Print01 {

	public static void main(String[] args) {
		System.out.printf("\\n : new line \n"); // \n : new line
		System.out.printf("\\t : tab\n"); // \n : new line
		System.out.printf("\\b : 백스페이스\n"); // \b 백스페이스
		System.out.printf("\\\' : \'출력\n"); // \\\' : \'출력
		System.out.printf("\\\" : \"출력\n"); // \\\" : \"출력
		System.out.printf("%%%% : %%출력\n"); // %% : %출력
		System.out.printf("\\\\ : 역슬래시 출력\n");  // \\ : 역슬래시 출력
		
		System.out.printf("군사법원의 조직\\권한 및 재판관의");
		System.out.printf("\b\b\b\b자격은 \"법률\"로 정한다.\n");
	}

}
