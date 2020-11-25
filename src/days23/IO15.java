package days23;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 자바에서는 객체 자체를 입출력할 수 있는 ObjectInputStream/ObjectOutputStream 클래스와
 * 객체를 저장하기 위한 인터페이스가 제공됩니다.
 * 사용자 정의 클래스를 사용하여 객체를 입력해야하는 경우 해당 클래스는 java.io.Serializable 인터페이스를
 * 반드시 구현(implements)해야 합니다.
 * Serializable 인터페이스는 어떠한 추상메서드도 제공하지 않습니다. (선언만 필요)
 */
class MyClass implements Serializable {
	String name;
}
public class IO15 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\juno\\workspaces\\Java_Project\\temp";
		File dir = new File(path);
		if (!dir.exists()) dir.mkdirs();
		
		File file = new File(dir, "MyClass.dat");
		MyClass obj = new MyClass();
		obj.name = "홍길동";
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(obj);
		oos.close();
	}
}
