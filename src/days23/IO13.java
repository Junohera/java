package days23;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
/*
 * #BufferedInputStream #binary
 * #BufferedReader #text
 */
public class IO13 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\juno\\workspaces\\Java_Project\\temp\\buffered";
		String binaryFileName = "binary_data_using_buffer.dat";
		String textFileName = "text_data_using_buffer.text";
		
		File dir = new File(path);
		
		if (!dir.exists()) dir.mkdirs();
		
		File binaryFile = new File(dir, binaryFileName);
		File textFile = new File(dir, textFileName);
		
		// 파일로부터 이진 데이터를 읽어올 수 있는 스트림 객체 생성
		BufferedInputStream binaryBIS = new BufferedInputStream(new FileInputStream(binaryFile));
		BufferedReader textBR = new BufferedReader(new FileReader(textFile));
		int input;
		while ( (input = binaryBIS.read()) != -1) {
			System.out.printf("%d ", input);
		}
		System.out.println();
		while ( (input = textBR.read()) != -1) {
			System.out.printf("%c", input);
		}
		// 스트림 종료
		
		binaryBIS.close();
		textBR.close();
	}
}
