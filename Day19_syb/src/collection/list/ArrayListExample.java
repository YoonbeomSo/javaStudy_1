package collection.list;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList객체 생성.
		//제네릭(generic): 타입의 안정화를 위해 객체 내부에
		//저장되는 타입을 일치시키는 방법.
		List<String> list = new ArrayList<String>(); //1.8부터는 생성자에는 <String> 대신 <>만 생성해도 된다.
		
		String str1 = "Java";
		String str2 = "JSP";
		System.out.println(list);
		
		//list에 객체를 저장하는 메서드 add(): 데이터를 맨 끝에 추가
		list.add(str1);
		list.add(str2);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP");//list는 객체의 중복 저장을 허용.
		System.out.println(list);
		
		//list에 저장된 총 객체 수 업기 size()
		int size = list.size();
		System.out.println("list에 저장된 총 객체 수: " + size);
		
		//list에 객체 삽입 add(index, 객체): 데이터를 해당 인덱스에 삽입.
		list.add(2,"Oracle");
		System.out.println(list);
		
		//list 데이터 수정 set(index, 객체)
//		list[3] = "MySQL"; (X)
		list.set(3, "MySQL");
		System.out.println(list);
		
		//list 내부 객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println(s);
		
		//list에 저장된 객체의 인덱스번호 확인하기 indexOf(객체)
		int idx = list.indexOf("MySQL");
		System.out.println(idx);
		
		//indexOf는 객체를 검색하지 못했을 경우 -1을 리턴합니다.
		idx = list.indexOf("안녕");
		System.out.println(idx);

		//list에서 객체데이터삭제 remove(index), remove(객체)
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		System.out.println(list);
		
		
		//list 내부에 저장된 객체의 유무확인 contains() -> true or false 리턴.
		System.out.println(list.contains(str2));
		
		//list의 반복문 처리
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("------------------");
		for(String str : list) {
			System.out.println(str);
		}
		
		//list 내부 객체 전체 삭제 clear()
		list.clear();
		System.out.println(list);
		
		//list 내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty() -> true or false 리턴.
		if(list.isEmpty()) {
			System.out.println("list가 비어있음.");
		}else {
			System.out.println("list가 비어있지 않음");
		}
		
	}
}
