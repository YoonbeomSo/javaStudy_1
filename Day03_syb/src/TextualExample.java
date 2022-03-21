
public class TextualExample {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 66;
		/*
		 * 한글'가'에 해당하는 유니코드 AC00을
		 * 직접 16진수형태로 저장하려면 탈출문자 \\u를
		 * 적어주어야 합니다.
		 */
		char c3 = '\uAC00';
		System.out.printf("%c %c %c \n", c1, c2, c3);    //A B 가
		
		//문자열을 저장할 수 있는 데이터 타입 String
		String s1 = "my dream";
		String s2 = "is a scientist";
		System.out.println("---------------");
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 + 연산을 진행할 수 있습니다.
		//연산결과로 문자열을 이어붙인 결과를 도출합니다.
		System.out.println(s1+s2);
		
		System.out.println("---------------");
		
		//문자열과 다른 데이터타입과의 +연산
		System.out.println(100 + 200);
		System.out.println(100+"200");
		System.out.println(10+20+"hello");
		System.out.println("hello"+(10+20));
		
		//기본데이터타입의 연산시 바이트가 큰쪽에 맞추어 연산.
		//char(2) 보다 int(4)가 용량이 더 크기 때문에 int로 변환 후 연산 
		System.out.println('A'+10);
		
	}

}
