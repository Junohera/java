package days13;
/*
 * #deep #copy #clone #String #reference #newString
 */
import java.util.Scanner;

class Student {
	private int bunho;
	private String name;
	private String [] subjects = {"국어", "영어", "수학"};
	private int [] scores;	// 성적을 저장하기 위한 배열 변수
	private int tot; 			// 총점을 계산하기 위한 변수
	private double avg; 	// 평균을 저장하기 위한 변수
	private char grade; 	// 학점을 저장하기 위한 변수
	
	Student(String name) {
		this.name = name;
		this.scores = new int[this.subjects.length];
	}
	Student(String name, int ...scores) {
		this(name);
		for (int i = 0; i < scores.length; i++) this.scores[i] = scores[i];
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.scores.length; i++) {
			System.out.printf("%s 점수를 입력하세요 : ", this.subjects[i]);
			this.scores[i] = sc.nextInt(); 
		}
		sc.close();
	}
	public Student copy () {
		Student target = new Student(new String(this.name)); // String도 레퍼런스변수이므로 새로운 메모리 할당받아 복사해주어야함. new String
		for (int i = 0; i< target.scores.length; i++) target.scores[i] = this.scores[i];
		target.calc();
		return target;
	}
	public void output() {
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\t%s\n", this.bunho, this.name, this.scores[0], this.scores[1], this.scores[2], this.tot, this.avg, this.grade);
	}
	public void calc() {
		this.tot = 0; // 생성자나 복사할경우, 2번이상 실행되므로 초기화
		
		for (int i = 0; i < scores.length; i++) tot += scores[i];
		avg = tot / (double)scores.length;
		if (90 <= avg) grade = 'A';
		else if (80 <= avg) grade = 'B';
		else if (70 <= avg) grade = 'C';
		else if (60 <= avg) grade = 'D';
		else grade = 'F';
	}
}
public class Class20 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		s1.input(); // 점수들 입력
		Student s2 = s1.copy(); // 새로운 메모리공간 할당받은 객체 복사
		Student s3 = new Student("홍길남", 98, 97, 96); // this(이름)을 호출하는 생성자
		
		s1.calc();
		s2.calc();
		s3.calc();
		
		printStart();
		s1.output(); // 번호 이름 점수 학점 등등을 화면에 적절히 출력
		s2.output();
		s3.output();
		printEnd();
	}
	
	private static void printStart() {
		System.out.printf("\n\t\t  ###성적표###\n");
		System.out.printf("--------------------------------------------------------\n");
		System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\t\t학점\n");
		System.out.printf("--------------------------------------------------------\n");
	}
	private static void printEnd() {
		System.out.printf("--------------------------------------------------------\n");
	}
}
