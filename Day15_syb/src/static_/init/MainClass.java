package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		//아래의 방법으로 info 출력과 생성자 호출을 할수도 있지만,
		//static 변수를 사용할때는 클래스 이름에.을 붙여
		//빠르게 사용하는 것을 목적으로 한다.
		//따라서 생성자 대신 정적초기화자를 사용한다.
//		Computer com = new Computer();
//		System.out.println(com.info);
		
		
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩해야 합니다.
		 - 클래스 로딩방법:
		 	1. 객체를 생성
		 	2. 클래스 이름을 통해 정적 멤버에 접근
		 */
		System.out.println(Computer.info); 
		System.out.println(Computer.info); 
		System.out.println(Computer.info); 
		//여러번 출력해도 정적 초기화자는 1번만 출력
	}

	
}
