package days21;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * #collection #copy #move #deepcopy #ArrayList<String> #Iterator #iter #remove
 */
public class Collection10 {
	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<String>(10);
		ArrayList<String> copy1 = new ArrayList<String>(10);
		ArrayList<String> copy2 = new ArrayList<String>(10);
		// 생성자에 전달인수로 10을 전달하여 ArrayList의 크기를 10개로 제한
		
		for (int i = 0; i < 10; i++) {
			original.add(i + "");
			// 숫자 + "" 연산은 결과가 아라비아 기호형의 문자가 됩니다.
			// 숫자 -> 문자 String.valueOf(i)와 같음
		}
		
		// copy1 = original // 복사되지 않습니다.
		
		Iterator<String> it = original.iterator();
		while(it.hasNext()) copy1.add(it.next());
		System.out.println("= original에서 copy1로 복사(copy) =");
		System.out.println("original : " + original);
		System.out.println("copy1 : " + copy1);
		
		it = original.iterator(); // Iterator는 재사용이 안되므로, 다시 얻어와야한다.
		while (it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		System.out.println("= original에서 copy2로 이동(move) =");
		System.out.println("original : " + original);
		System.out.println("copy2 : " + copy2);
	}
}
