package days13;

import java.util.Scanner;

class Student {
	private int bunho;
	private String name;
	private String [] subjects = {"국어", "영어", "수학"};
	private int [] scores; 	// 성적을 저장하기 위한 배열 변수
	private int tot; 			// 총점을 계산하기 위한 변수
	private double avg; 	// 평균을 저장하기 위한 변수
	private char grade; 	// 학점을 저장하기 위한 변수
	
	Student() {
		this.bunho = 0;
	}
	Student(String name) {
		this.name = name;
	}
	Student(String name, int ...scores) {
		this(name);
		this.scores = new int[scores.length];
		for (int i = 0; i < scores.length; i++) this.scores[i] = scores[i];
	}
	public void input(int ... scores) {
		this.scores = new int[scores.length];
		this.tot = 0;
		this.avg = 0;
		for (int i = 0; i < scores.length; i++) {
			this.scores[i] = scores[i];
			this.tot += scores[i];
		}
		this.avg = this.tot / this.scores.length;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		scores = new int[subjects.length];
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s 점수를 입력하세요 : ", subjects[i]);
			scores[i] = sc.nextInt(); 
		}
		
		sc.close();
	}
	public Student copy () {
		Student target = new Student();
		target.bunho = this.bunho + 1;
		target.name = this.name;
		target.scores = new int[this.scores.length];
		for (int i = 0; i< target.scores.length; i++) {
			target.scores[i] = this.scores[i];
		}
		target.tot = this.tot;
		target.avg = this.avg;
		target.grade = this.grade; 
		return target;
	}
	public void output() {
		System.out.printf("%d", this.bunho);
	}
}
public class Class20 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		s1.input(); // 점수들 입력
		Student s2 = s1.copy(); // 새로운 메모리공간 할당받은 객체 복사
		Student s3 = new Student("홍길남", 100, 100, 100); // this(이름)을 호출하는 생성자
		s1.output(); // 번호 이름 점수 학점 등등을 화면에 적절히 출력
		s2.output();
		s3.output();
	}
}
