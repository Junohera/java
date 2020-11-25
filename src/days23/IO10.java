package days23;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 선거에 있어서 최고득표자가 2인 이상인때에는
 * 국회의 재적인원 과반수가 출석한 공개회의에서 다수표를 얻은 자를 당선자로 한다. 이 헌법시행당시의 법령과 조약은ㅇ 이 헌법에 위배되지 아니하는 한 그 효력을 지속한다.
 * 
 * 국회의 회의는 공개한다. 다만, 출석의원 과반수의 찬성이 있거나 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있다.
 */
public class IO10 {
	public static void main(String[] args) throws IOException {
		
		/** 파일 쓰기(문자)  = FileWriter*/
		File dir = new File("C:\\juno\\workspaces\\Java_Project\\temp");

		// 디렉토리 없으면 생성
		if (!dir.exists()) dir.mkdirs();

		// 파일 생성
		File textFile = new File(dir, "abc.txt");
		
		// 생성된 파일 수정준비
		FileWriter fw = new FileWriter(textFile);
		
		String desc = "";
		desc += "선거에 있어서 최고득표자가 2인 이상인때에는";
		desc += "국회의 재적인원 과반수가 출석한 공개회의에서 다수표를 얻은 자를 당선자로 한다. 이 헌법시행당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속한다.";
		desc += "\n\n";
		desc += "국회의 회의는 공개한다. 다만, 출석의원 과반수의 찬성이 있거나 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있다.";
		
		// 파일 수정
		fw.write(desc);
		fw.close();
		
		/** 파일 읽기(문자) = FileReader */
		FileReader fr = new FileReader(textFile);
		
		int d;
		String text = "";
		while((d = fr.read()) != -1) {
			text += (char)d;
		}
		System.out.println(text);
		fr.close();
	}
}
