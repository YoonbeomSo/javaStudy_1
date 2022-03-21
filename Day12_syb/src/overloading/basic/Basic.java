package overloading.basic;


/*
 *  오버로딩(중복0 - 하나의 클래스 내부에 같은 이름을 가진 메서드를
 *  여러 개 선언할 수 있게 하는 문법
 *  
 *  1. 매개 변수의 데이터 타입이 달라야 함.
 *  2. 매개 변수의 순서가 달라야 함.
 *  3. 매개 변수의 개수가 달라야 함.
 */
public class Basic {
	
	void input(int a) {
		System.out.println("정수 1개가 입력됨.");
	}

	void input(String s) {
		System.out.println("문자열 1개가 입력됨.");
	}
	
	void input(int a, int b) {
		System.out.println("정수 2개가 입력됨.");
	}
	
	void input(String s, double d) {
		System.out.println("문자열 1개와 실수 1개가 입력됨.");
	}
	
	void input(double x, String y) {
		System.out.println("실수 1개와 문자열 1개가 입력됨.");
	}
	
	
	
//	타입과 개수가 겹쳐서 안됨.
//	void input(int i) {
//		System.out.println("정수 1개가 입력됨");
//	}

}
