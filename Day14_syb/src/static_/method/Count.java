package static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반 메서드 선언.
	public int method1() {
		//일반 메서드 안에서는 일반멤버변수와 정적멤버변수를 모두 참조할 수 있음.
		a = 10;
		b = 20;
		return a + b;
	}
	
	
	//정적 메서드 선언.
	public static int method2() {
		/*
		 - static 메서드 내부에서는 static이 붙은 변수나 메서드만 
		   참조할 수 있습니다.
		 - static 블록 내부에서 non-static멤버를 참조하려면 
		   객체 생성을 통해 참조해야 합니다.
		 */
//		a = 10; (x)
		Count c = new Count();
		c.a = 10;         //a:non-static멤버
		return c.a + b;
	}
	
	
}
