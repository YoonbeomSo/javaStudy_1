package modi.cls.pac2;

import modi.cls.pac1.B;
//import modi.cls.pac1.A;

public class C {

	//클래스 B는 public클래스이기 때문에 다른 패키지에서 사용 가능.
	B d = new B();
	
	//클래스 A는 package friendly클래스이기 때문에 다른 패키지에서 사용 불가능.
//	A a = new A();
	
}
