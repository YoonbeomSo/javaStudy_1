package collection.set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		// add(): set에 객체를 추가
		set.add("닭강정");
		set.add("김밥");
		set.add("김말이");
		set.add("단무지");
		set.add("김밥");
		// size(): Set에 저장된 객체의 수를 알아보는 메서드
		System.out.println("set에 저장된 객체 수: " + set.size()); // >>4 중복데이터 허용 x
		System.out.println(set);

		/*
		 * - Set의 객체데이터를 사용하려면 반복자(Iterator)를 통해 
		 *  모든 객체를 대상으로 한번씩 반복해서 꺼내야 합니다.
		 */
		Iterator<String> iter = set.iterator();

		
		/*
		 * - 반복자 객체가 next()메서드를 통해 set 내부의 데이터를
		 *  반복 소진할 때 더 이상 조회할 데이터가 없으면 예외를 발생시키기
		 *  때문에 hasNext()를 통해 더 이상 소모할 데이터가 있는지의
		 *  유무를 체크합니다.
		 */
		
		while (iter.hasNext()) {
			String s = iter.next();
			if(s.equals("단무지")) {
				System.out.println(s);
				break;
			}
		}

		
		//remove(), clear() : Set의 데이터 삭제기능
		set.remove("단무지");
		System.out.println(set);
		set.clear();
		if(set.isEmpty()) {
			System.out.println("set이 비어있음");
		}else {
			System.out.println("set이 비어있지 않음.");
		}
		
	}

}
