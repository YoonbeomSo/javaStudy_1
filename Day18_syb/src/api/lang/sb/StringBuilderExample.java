package api.lang.sb;

public class StringBuilderExample {

	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("JAVA");
		
		//문자열을 끝에 추가하는 메서드 append()
		sb.append(" Program Study");
		System.out.println(sb);
		
		/*
		 * String str = "JAVA";
		 * str = str + "Program Study";
		 * System.out.println(str);
		 */
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//특정 인덱스 범위의 문자열을 교체하는 메서드 replace()
		sb.replace(5, 16, "book");
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드 delete(begin, end)
		//JAVA Study
		sb.delete(4, 9);
		System.out.println(sb);
		
		
		System.out.println(sb.length());
		
		
	}
}
