package days23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {
	public static void main(String[] args) throws IOException {
		// C:\juno\workspaces\Java_Project\temp\abc.txt 파일의 내용을 읽어 콘솔에 출력
		String path = "C:\\juno\\workspaces\\Java_Project\\temp\\";
		String fileName = "abc";
		String fileExt = ".txt";
		
		File dir = new File(path);
		
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		try {
			FileReader fr = new FileReader(path + fileName + fileExt);
			
			int d;
			String res = "";
			while ((d = fr.read()) != -1) {
				res += (char)d;
			}
			fr.close();
			System.out.println(res);
		} catch (FileNotFoundException e) {
			System.out.printf("해당 파일은 존재하지 않습니다. [%s]", path + fileName + fileExt);			
		}
	}
}
