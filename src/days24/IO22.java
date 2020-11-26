package days24;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IO22 {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException, ClassNotFoundException {
		File dir = new File("/Users/juno/dev/project/javaBase/temp");
		String[] f = dir.list(); // 설정폴더 안의 모든 파일의 이름을 문자열 배열로 반환
//		for (String file : f) System.out.println(file);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 d일 H시 m분 기록된 내역");
		
		// 설정 폴더 안의 파일의 갯수만큼 반복실행
		for (int k = 0; k < f.length; k++) {
			// 2020_11로 시작하는 파일만 선별
			if (f[k].substring(0, 7).equals("2020_11")) {
				int i = f[k].indexOf(".dat"); // .dat의 파일 이름내의 위치값을 얻습니다.
				String s = f[k].substring(0, i); // 그 번째전까지 substring으로 추출(파일이름만 추출)
				Date date = sdf1.parse(s); // 얻어낸 파일이름을 실제 날짜 데이터로 파싱(변환)
				// sdf2의 포맷 "yyyy년 M월 d일 H시 m분 기록된 내역"으로 변환
				String title = sdf2.format(date);
				File file = new File(dir, f[k]); // 배열의 저장된 파일이름들로 입력 파일 설정
				
				// 파일에서 객체를 읽어낼 수 있는 객체 생성
				ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
				
				// 파일에서 읽어온 내용을 리스트에 저장(CalculatorResult 객체들이 저장된 ArrayList
				ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>)ois.readObject();
				
				// 파일이름으로부터 날짜와 출력형식이 구성된 title 출력 : 
				// ex) 2020년 1월 17일 14시 26분에 기록된 내역
				System.out.println(title);
				// 한 파일에 하나의 list가 있으므로 리스트의 크기만큼 객체 출력
				for (i = 0; i < list.size(); i++) System.out.printf("%d. %s\n", i+1, list.get(i));
				System.out.println();
				ois.close();
			}
		}
	}

}
