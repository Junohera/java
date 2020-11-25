package days23;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Point implements Serializable {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x : " + this.x + ", y : " + this.y;
	}
}
public class IO17 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File dir = new File("C:\\juno\\workspaces\\Java_Project\\temp");
		if (!dir.exists()) dir.mkdirs();
		File file = new File(dir, "Point.dat");
		
		ArrayList<Point> list = new ArrayList<Point>();
		
		for (int i = 0; i < 100; i++) {
			Point temp = new Point((int)(Math.random()*100), (int)(Math.random()*100));
			list.add(temp);
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(list);
		oos.close();
	}
}
