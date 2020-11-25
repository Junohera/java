package days23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
/*
 * #FileInputStream #binary
 * #FileReader #text
 */
public class IO09 {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\juno\\workspaces\\Java_Project\\temp");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file_binary = new File(dir, "binary_data.dat");
		File file_text = new File(dir, "text_data.txt");
		
		// 파일로부터 이진 데이터를 읽어올 수 있는 스트림 객체 생성
		FileInputStream fis_binary = new FileInputStream(file_binary);
		// 파일로부터 텍스트 데이터를 읽어올 수 있는 스트림 객체 생성
		FileReader fr_text = new FileReader(file_text);
		
		int data_binary;
		data_binary = fis_binary.read();
		System.out.println(data_binary);
		data_binary = fis_binary.read();
		System.out.println(data_binary); // 파일의 긑에 도착하면 -1값이 반환
		data_binary = fis_binary.read();
		System.out.println(data_binary);
		fis_binary.close();
		
		/*
		 * 주의사항
		 * 만약 텍스트 파일의 내용을 한 글자씩 읽어들이는 경우 반드시 int 타입으로 문자값을 전달 받아야합니다.
		 * 파일에 긑에 도달하면 -1값이 반환하지만 char은 부호가 없는 자료형이므로 -값을 처리할 수 없습니다.
		 * 무조건 양수로만 취급하여 반복을 빠져나올 수 없습니다.
		 */
		int data_text;
		while((data_text = fr_text.read()) != -1) {
			System.out.print((char)data_text);
		}
		fr_text.close();
		
	}
}
