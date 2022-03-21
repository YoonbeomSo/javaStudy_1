package str_equals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String 객체를 생성할 시 같은 주소값을 공유하게 됩니다.
		 */
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2); //true
		
		Scanner scan = new Scanner(System.in);
		User u = new User("abc1234");
		System.out.print("비밀번호 입력: ");
		String password = scan.next();
		
//		if(password == u.pw) //이렇게 하면 문자열이 같아도 주소가 달라 false가 나옴
		if(password.equals(u.pw)) {
			System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
			
		
	}
}
