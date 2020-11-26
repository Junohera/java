package days24;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IO21 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("/Users/juno/dev/project/javaBase/temp");
		if (!dir.exists()) dir.mkdirs();
		File file = new File(dir, "2020_11_26_10_35.dat");
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>)ois.readObject();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, list.get(i));
		}
		ois.close();
	}

}
