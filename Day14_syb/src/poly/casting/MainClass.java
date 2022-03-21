package poly.casting;

public class MainClass {

	public static void main(String[] args) {
	
		//Promotion이 적용되면 자식클래스의 본래멤버를 참조할 수 없음.
		Parent p = new Child();
		p.method1();
		p.method2();
//		p.method3(); (x)
		System.out.println("=======================");
		
		Child c = (Child)p;
		c.method3();
		
		Child cc = new Child();
		cc.method3();
		
		/*
		 *  한번 promotion이 일어난 객체를 대상으로만 강제타입변환을
		 *  사용할 수 있습니다.
		 */
//		Child ccc = (Child) new Parent(); (x)
		
	}

}
