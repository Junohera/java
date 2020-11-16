package days16;

class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name; this.age = age;
	}
	public String toString() {
		String info = "name = " + this.name + ", ";
		info += "age = " + this.age;
		return info;
	}
	// 사용자 정의 클래스에서 객체(멤버필드등의 값들)의 같음을 비교하기위해 equals method를 사용하려면
	// toString과 같이 클래스 내부 빈공간에 equals method를 오버라이딩해야만 합니다.
	
	/*
	 *  객체의 비교를 수행하기 위한 equals method 올바른 equals method의 정의 방법
	 *  0. Object class method 원형대로 오버라이드 method 형식을 정의(리턴형, 전달인수 등)
	 *  1. 매개변수로 전달된 Object 타입의 변수에 대해서 타입 체크를 진행
	 *  	현재 클래스와 동일한 타입인지를 비교 - instanceof 사용
	 *  2. 동일한 타입이 전달되지 않았다면 return false;
	 *  3. 만약 동일한 타입이 전달되었다면 강제 형변환을 통해서 현재 사용중인 클래스 타입으로 변환
	 *  4. 타입이 변환된 레퍼런스를 사용하여 멤버필드의 값을 비교
	 *  5. 비교결과를 반환
	 */
	public boolean equals(Object obj) {
		// this <- s1    obj <- s2
		// obj.name; 사용불가 obj.age; 사용불가
		// 부모클래스의 레퍼런스 변수 <- 자식의 인스턴스 : 사용 가능
		// 자식클래스의 레퍼런스 변수 <- 부모클래스의 인스턴스 : 사용불가
		// 자식클래스의 레퍼런스 변수 <- (자식클래스캐스팅)부모클래스의 인스턴스 : 에러는 없지만 실행시 런타임오류
		// 자식클래스의 레퍼런스 변수 <- (자식클래스캐스팅)부모클래스의 레퍼런스변수  <- 자식클래스의 인스턴스
		// : 가능
		
		// 1. 타입비교 2. 비교할 수 없는 타입이라면 return false;
		if (!(obj instanceof Student)) return false;
		// 3. 부모 레퍼런스로는 자식의 멤버변수를 접근할 수 없기 때문에 강제 형변환을 통해서 자식타입으로 변환
		Student target = (Student)obj;
		// 4. 타입이 변환된 레퍼런스를 사용하여 멤버필드의 값을 비교
		boolean flag_name = this.name.equals(target.name); // 문자열간 비교. String의 equals
		boolean flag_age = this.age == target.age;
		boolean result = flag_name && flag_age;
		// 5. 비교결과를 반환
		return result;
	}
}
public class Object04 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 21);
		Student s2 = new Student("홍길동", 21);
		Student s3 = new Student("홍길서", 22);
		System.out.println("학생 1번의 정보 : " + s1); // print || "" + Object => object.toString();
		System.out.println("학생 2번의 정보 : " + s2);
		System.out.println("학생 3번의 정보 : " + s3);
		
		// 레퍼런스 변수들 간의 비교
		// .equals method를 사용하여 비교(before equals method override)
		//	if (s1 == s2) System.out.println("s1변수와 s2변수는 같습니다.(s1 == s2)");
		//	else System.out.println("s1변수와 s2변수는 다릅니다.(s1==s2)");
		// 결과 : s1변수와 s2변수는 다릅니다.(s1 == s2) : new Student의 결과
		// Object 클래스의 equals method는 오버아리드 되기 전 상태에서 두 객체의 레퍼런스 값을 비교하는 연산만을 수행합니다.
		
		// .equals method를 사용하여 비교(after equals method override)
		if (s1.equals(s2)) System.out.println("s1변수와 s2변수는 같습니다.(s1.equals(s2))");
		else System.out.println("s1변수와 s2변수는 다릅니다.(s1.equals(s2))");
		
		if (s1.equals(s3)) System.out.println("s1변수와 s3변수는 같습니다.(s1.equals(s3))");
		else System.out.println("s1변수와 s3변수는 다릅니다.(s1.equals(s3))");
	}

}
