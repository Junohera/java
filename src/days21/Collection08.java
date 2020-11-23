package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * #for #iterator #iter #hasNext #next #while #hashSet #linkedList #list #collection #Collections #sort #정렬 #캐스팅 #hashSetSort
 */
public class Collection08 {
	public static void main(String[] args) {
		// 로또 번호를 저장하기 위해서 HashSet클래스를 활용하는 예제
		// (중복을 허용하지 않는 특징을 활용)
		HashSet<Integer> lotto = new HashSet<Integer>();
		int count = 0;
		while (lotto.size() < 6) {
			count++;
			int temp = (int)(Math.random() * 45 + 1);
			// Math.random() : 소수점 아래에서 랜덤하게 발생된 숫자를 발행(0.456789456)
			// 45를 곱하면 소수점 위로 0~44사이의 숫자가 올라옵니다.
			// 1을 더해서 1~45를 만들고 소수점 아래를 (int)로 잘라냅니다.
			System.out.println(temp);
			lotto.add(temp);
		}
		
		System.out.println(lotto);
		System.out.println("실행 횟수 : " + count );
		
		/*
		 * HashSet 타입의 객체 내부를 순회하는 방법
		 * 1. Iterator 객체를 사용하는 방법
		 * - Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		 */
		System.out.println("### iter");
		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) System.out.printf("%d ", iter.next());
		// 제어권을 넘겨받아서 위와 같이 한번 리스트를 모두 순회하면,
		// iter = lotto.iterator(); 를 통해서 다시 방문 필요할때 제어권을 다시 얻어내야합니다.
		
		System.out.println();
		System.out.println("### for");
		/*
		 * 2. for문을 사용하는 방법(개선된 형태)
		 * - for (자료형 변수명 : 순회할 수 있는 타입(배열, 컬렉션))
		 * 배열/컬렉션으로부터 추출한 변수를 사용하는 코드
		 */
		for (Integer i : lotto) System.out.printf("%d ", i);
		/*
		 * Integer i 부분 : 오른쪽의 배열이나 리스트의 아이템 하나를 저장할 변수선언
		 * lotto 부분 : 왼쪽 변수에 차례로 하나씩 전달해줄 수 있는 아이템을 보유한 컬렉션 또는 배열
		 * 오른쪽 리스트 또는 배열의 값을 차례로 하나씩 왼쪽 변수에 값을 전달하면서 1회의 반복실행을 진행합니다. 
		 */
		System.out.println();
		
		/*
		 * HashSet Collection에는 sort메서드가 없음 따라서 LinkedList
		 * 부모 클래스인 List클래스에 전달해서 리스트 변환과정을 거치고,
		 * Collection.sort로 정렬을 수행하여야 합니다.
		 */
		List<Integer> list = new LinkedList<Integer>(lotto);
		List<Integer> list2 = new ArrayList<Integer>(lotto);
		List<Integer> list3 = new Vector<Integer>(lotto);
		Collections.sort(list);
		Collections.sort(list2);
		Collections.sort(list3);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
	}
	
}
