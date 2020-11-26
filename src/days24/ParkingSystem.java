package days24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Car implements Serializable {
	private String carNumber;
	private String enterDateTime;
	Car (String carNumber) {
		// 캘린더에서 날짜를 얻어오고 Date 형식으로 저장
		Date now = Calendar.getInstance().getTime();
		// "yyyy-MM-dd_HH:mm" 날짜 포맷을 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		// 날짜 포맷에 now 변수에 있는 날짜를 적용 -> ""를 이어붙이기해서 String형으로 변환
		String enterDT = sdf.format(now) + ""; // "2020-11-26_12:14"
		this.carNumber = carNumber; // 전달된 차번호를 멤버변수에 저장
		this.enterDateTime = enterDT; // 오늘날짜를 변형한 입차시간을 멤버변수에 저장
	}
	
	@Override
	public String toString() {
		return this.carNumber + " # " + this.enterDateTime;
	} // 12가1234 # 2020-07-07_14:30 출력
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) return false;
		Car target = (Car)obj;
		boolean result = this.carNumber.equals(target.carNumber);
		return result;
	}
	
	public String getEnterDateTime() {
		return enterDateTime;
	}
	public void setEnterDateTime(String enterDateTime) {
		this.enterDateTime = enterDateTime;
	}
	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int paycount() throws ParseException {
		int pay = 0;
		//현재시간(출차시간) 생성(Calendar) - 입차시간과 출차시간의 차를 구하기 위한 동작
		Calendar outTime = Calendar.getInstance();
		
		// SimpleDateFormat("yyyy-MM-dd_HH:mm") 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		
		// 입차시간(enterDateTime-String자료) sdf.parse로 *** Date형태로 전환 ***
		Date eT = sdf.parse(this.enterDateTime);
		
		// 입차시간변수생성(Calendar)
		Calendar enterTime = Calendar.getInstance();
		// Date형태로 전환된 입차시간을 Calendar형 변수에 세트
		enterTime.setTime(eT);
		
		// (출차시간 밀리초 - 입차시간 밀리초) / 1000 -> 초(second) 단위로 주차시간 계산
		long dif = (outTime.getTimeInMillis() - enterTime.getTimeInMillis()) / 1000;
		// 입차시간부터 출차시간까지의 차가 초단위로 dif변수에 저장
		
		int min = (int)(dif/60); // 60으로 나누면 분
		int hour = min/60; // 60으로 나누면 시
		min = min%60;  // 시간을 제외한 나머지 분
		min = min / 10;  // 10분당 400을 곱하기 위해 20분 같은 분을 2로 환산
		  
		// 최종 주차비 계산
		return hour*2000 + min*400;
		 
	}// 주차비 계산 : 현재시간을 출차시간으로 하여 밀리초끼리의 뺄셈연산 후 다시 시분초로 환산
	//시간당 2000원, 10분당 400원
}

public class ParkingSystem {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
		Scanner sc = new Scanner(System.in);
		File dir = new File("/Users/juno/dev/project/javaBase/file/parking");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "parking.dat");
		
		ArrayList<Car> list; // 주차중인 차가 저장될 리스트
		if (!file.exists()) {
			System.out.println("파일이 없습니다.");
			list = new ArrayList<Car>();
		} else {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			list = (ArrayList<Car>)ois.readObject();
			ois.close();
		} // 파일이 있으면 열어서 파일내용을 읽어서 리스트 저장, 최초 실행이라 파일이 없으면 새로 리스트 생성
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 입차\t2. 출차\t3. 주차상황\t4. 종료");
			System.out.printf("입력>>");
			int input;
			input = sc.nextInt();
			if (input == 4) { // 4 입력시 while문 종료 리스트를 파일에 저장후 프로그램도 종료 
				break;
			}
			
			switch (input) {
				case 1:
					enterCar(list);
					break;
				case 2:
					outCar(list);
					break;
				case 3:
					prn(list);
					break;
				case 5:
					for (int i = 0; i < list.size(); i++) {
						list.get(i).setEnterDateTime("2020-11-26_10:00");
					}
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			oos.writeObject(list); // 주차중인 리스트를 파일에 저장
			oos.close();
		}
	}

	private static void prn(ArrayList<Car> list) {
		System.out.println("주차중 차량 목록--------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
	}

	private static void outCar(ArrayList<Car> list) throws ParseException {
		// list사이즈가 0이면 출차할 차가 없습니다. 라는 메시지와 함께 메서드 종료
		if (list.size() == 0) {
			System.out.println("출차할 차가 없습니다.");
			return;
		}
		
		// 차량 번호 입력(뒤 숫자 네자리만 입력)
		System.out.println("출차할 차의 차량번호 뒷자리 4자리를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		// 차번호 검색 후 같은 번호의 차량리스트 출력(순번과 차량번호 전체)
		Car[] cars = new Car[10]; // 중복된 차량 리스트를 담을 배열
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCarNumber().indexOf(num) != -1) {
				// num값이 현재차의 번호의 일부로 존재한다면...
				cars[i] = list.get(i); // 현재 차량의 저장되 리스트 주소값을 cars 배열의 같은 위치에 저장
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) { // cars 배열값들중 널이 아닌것들만 화면에 번호와 함께 출력
				System.out.println((i + 1) + ". " + cars[i].toString());
				count++;
			}
		}
		
		// 찾는 차량이 없으면 없다는 메시지와 함께 메서드 종료
		if (count == 0) {
			System.out.println("입력한 차량이 없습니다.");
			return;
		}
		
		// 출력된 리스트(1개 이상)에서 출차할 차량의  순번 입력
		System.out.println("출차할 차의 맨앞 주차번호를 입력하세요");
		int k = sc.nextInt();
		
		// 요금계산
		int pay = cars[k-1].paycount(); // 요금 계산
		// 요금출력
		System.out.println("주차 요금은 " + pay + "원입니다.");
		// 출차
		list.remove(k-1);
	}

	private static void enterCar(ArrayList<Car> list) {
		if (list.size() == 10) {
			System.out.println("만차~더이상 주차할 수 없습니다\n\n");
			return;
		}
		// 차량번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입차 : 차량번호를 입력하세요");
		String num = sc.nextLine();
		// Car 객체 생성 : 생성자를 이용한 멤버 변수 초기화기능 실행
		Car c = new Car(num);
		// 리스트에 차량 저장
		list.add(c);
	}
}
