package collection.map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Map<key,Value>
		Map<String, Integer> map = new HashMap();
		
		//Map에 객체를 저장 put(Key, Value)
		map.put("치킨", 20000);
		map.put("라면", 2000);
		map.put("족발", 30000);
		//중복 key를 통해 put을 사용하면 Value가 수정됨.
		map.put("라면", 3000); 

		System.out.println(map);
		
		//size() : Map에 저장된 총 Entry객체 수 얻기 
		System.out.println("Map에 저장된 총 객체 수: " + map.size());
		
		
		//get(key) : Map에 저장된 Value 값 얻기
		Integer price = map.get("족발");
		System.out.printf("족발의 가격: %d원\n", price);
		
		//keySet() : Map에서 key를 전부 추출하는 메서드
		Set<String> kSet = map.keySet();
		System.out.println(kSet); //>> [족발, 치킨, 라면]
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("-------------------------------");
		
		while(kIter.hasNext()) {
			String foodName = kIter.next();
			int foodPrice = map.get(foodName);
			System.out.printf("%s의 가격은 %d 입니다.\n", foodName, foodPrice);
		}
		
		//containsKey() : Map내부에 있는 key의 유무를 확인하는 메서드
		String food = "치킨";
		
		if(map.containsKey(food)) {
			System.out.println(food + "의 가격은 " + map.get(food) + " 입니다.");
		}else {
			System.out.println(food + "는 없는 메뉴입니다");
		}
		
		//remove(key), clear() : Map 내부 데이터 삭제 
		//해당 key에 대응하는 Entry객체를 삭제
		map.remove("치킨");
		System.out.println(map);
		
		map.clear();
		if (map.isEmpty()) {
			System.out.println("map이 비어 있습니다.");
		}else {
			System.out.println("map이 비어 있지 않습니다.");
		}
		
	}

}
