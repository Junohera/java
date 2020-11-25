package days23;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/*
 * #BufferedOutputStream #binary
 * #BufferedWriter #text
 */
public class IO12 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\juno\\workspaces\\Java_Project\\temp\\buffered";
		String binaryFileName = "binary_data_using_buffer.dat";
		String textFileName = "text_data_using_buffer.text";
		
		File dir = new File(path);
		
		if (!dir.exists()) dir.mkdirs();
		
		File binaryFile = new File(dir, binaryFileName);
		File textFile = new File(dir, textFileName);
		
		// 파일에 이진 데이터를 출력할 수 있는 객체 생성
		BufferedOutputStream binaryBOS = new BufferedOutputStream(new FileOutputStream(binaryFile));
		// 파일에 문자 데이터를 출력할 수 있는 객체 생성
		BufferedWriter textBW = new BufferedWriter(new FileWriter(textFile));
		
		/*
		 * 버퍼에 내용을 출력
		 * 버퍼에 추렭된 데이터는 해당 스트림이 close 되거나 해당 스트림 객체에 대해서 flush 메서드가
		 * 호출되면 실제 스트림을 통해서 출력됩니다.
		 */
		binaryBOS.write(255);
		binaryBOS.write(22);
		// flush 메서드는 버퍼에 쌓여있는 데이터를 출력하는 메서드 (버퍼를 비우는 명령을 실행)
		binaryBOS.flush();
		
		textBW.write("Hello ");
		textBW.write("World~!");
		// flush 메서드는 버퍼에 쌓여있는 데이터를 출력하는 메서드 (버퍼를 비우는 명령을 실행)
		textBW.flush();
		
		binaryBOS.close();
		textBW.close();
	}
}
