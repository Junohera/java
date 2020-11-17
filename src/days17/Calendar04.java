package days17;

import java.util.Calendar;

import days08.MyCalender;

public class Calendar04 {
	static String toDate(Calendar c) {
		String cDate = c.get(Calendar.YEAR) + "년\t"
				+ (c.get(Calendar.MONTH) + 1) + "월\t"
				+ c.get(Calendar.DATE) + "일";
		return cDate;
	} // 캘린더 객체(날짜)를 전달인수로 하고 문자열을 리턴받는 메서드
	
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2005,  7, 31); // 입력한 날짜로 세팅(set)
		System.out.println(toDate(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1); // 입력한 숫자만큼 증감(add)
		System.out.println(toDate(date));
		// add 메서드의 증감은 하나의 요소를 변경하지만, 그로인해 다른 필드에 영향을 줄 수 있습니다.
		// 일을 변경하여 달이 바뀌거나, 월을 변경하여 년도가 바뀌는 변경 등
		
		System.out.println("= 6달 후 =");
		date.add(Calendar.MONTH, 6);
		System.out.println(toDate(date));
		
		System.out.println("= 40일 후(roll) =");
		date.roll(Calendar.DATE, 40);
		// 다른 필드에 영향을 주지 않고 해당 필드만으로 더하고 빼는 메서드
		// 3월 1일에서 30일 더하면 3월 31일(30일)이 되고, 이후 10일이 더해져 다시 10이 나옴
		// 월에는 영향을 주지 않음 결과 3월 10일
		System.out.println(toDate(date));
	}
}