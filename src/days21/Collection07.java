package days21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

/*
 * HashSet 클래스
 * 데이터의 중복을 허용하지 않고 저장하는 클래스
 * - 검색을 위해서 사용되는 클래스
 * (저장할때 hash연산의 결과로 저장하니, 검색할때도 hash연산 결과로 검색하여 빠른 검색이 가능)
 * hash연산 : 클래스내에서 유일한 값을 얻어낼 수 있는 고유 알고리즘연산
 * - 중복된 값을 제거하면서 데이터를 저장하기위해 사용
 */
public class Collection07 {
	public static void main(String[] args) {
		int[] test = {1, 2, 2};
		
		Vector<Integer> v = new Vector<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		LinkedList<Integer> l = new LinkedList<Integer>();
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < test.length; i++) {
			v.add(test[i]);
			a.add(test[i]);
			l.add(test[i]);
			h.add(test[i]);
		}
		
		System.out.println(v.size()); // 중복을 허용하므로 3
		System.out.println(a.size()); // 중복을 허용하므로 3
		System.out.println(l.size()); // 중복을 허용하므로 3
		System.out.println(h.size()); // 중복을 허용하지 않으므로 2
	}
}
