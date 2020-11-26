package days24;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class IO23 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 특정 날짜를 입력받아서 그날짜 파일만 출력하세요
		// 날짜 입력 양식을 정해서 잘못된 입력은 다시 입력 받게 설정하세요.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputDate;
		Date iDate = null;

		System.out.print("출력할 날짜를 입력하세요. (2020-01-01)");
		while (true) {
			try {
				inputDate = in.readLine(); // 날짜 입력
				iDate = sdf1.parse(inputDate);
				break;
			} catch (ParseException e) {
				System.out.println("입력 형식이 잘못되었습니다. 2020-01-01 형식으로 다시 입력하세요.");
			}
		}
		
		File dir = new File("/Users/juno/dev/project/javaBase/temp");
		if (!dir.exists()) dir.mkdirs();
		String[] fileNames = dir.list();
		
		ArrayList<String> sameFileNames = new ArrayList<String>();
		for (int i = 0; i < fileNames.length; i++) {
			String fileName = fileNames[i].substring(0, fileNames[i].indexOf(".dat"));
			Date fDate;
			try {
				fDate = sdf2.parse(fileName);
				if (inputDate.equals(sdf1.format(fDate))) {
					sameFileNames.add(fileNames[i]);
				}
			} catch (ParseException e) {}
		}
		
		for (String name : sameFileNames) {
			System.out.println(name);
			File file = new File(dir, name);
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>)ois.readObject();
			System.out.println(inputDate + " 기록 내역 : ");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d, %s\n", i + 1, list.get(i));
			}
			ois.close();
		}
	
	}

}
