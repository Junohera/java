package days23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IO14 {
	public static void main(String[] args) {
		// ~/temp 폴더안의 eclipse-inst-jre-win64.exe파일을
		// ~/copy 폴더로 복사
		
		String originPath = "C:\\juno\\workspaces\\Java_Project\\temp";
		String copyPath = "C:\\juno\\workspaces\\Java_Project\\copy";
		String fileName = "eclipse-inst-jre-win64.exe";
		
		try {
			copyPreprocess(originPath, copyPath, fileName);
			copyFileText(originPath, copyPath, fileName); // text로는 불가능?
//			copyFileBinary(originPath, copyPath, fileName);
		} catch (IOException e) {
			
		}
	}
	
	public static void copyPreprocess(String originPath, String copyPath, String fileName) {
		File originDir = new File(originPath);
		File copyDir = new File(copyPath);
		
		if (!originDir.exists()) originDir.mkdirs();
		if (!copyDir.exists()) copyDir.mkdirs();
	}
	
	public static void copyFileText (String originPath, String copyPath, String fileName) throws IOException {
		File originFile = new File(originPath, fileName);
		File copyFile = new File(copyPath, fileName);
		
		BufferedReader br = new BufferedReader(new FileReader(originFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(copyFile));

		int d;
		while ( (d = br.read()) != -1) {
			bw.write((char) d);
		}
		
		br.close();
		bw.close();
		
		System.out.println("finish");
	}
	
	public static void copyFileBinary (String originPath, String copyPath, String fileName) throws IOException {
		File originFile = new File(originPath, fileName);
		File copyFile = new File(copyPath, fileName);
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFile));
		
		byte[] data = new byte[1024];
		int size;
		while( (size = bis.read(data)) != -1) {
			bos.write(data, 0, size);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("finish");
	}
}
