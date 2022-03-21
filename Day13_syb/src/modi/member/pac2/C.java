package modi.member.pac2;

import modi.member.pac1.A;

public class C {

	public C() {
		
		A a = new A();
		
		a.a =1; //public(o)
//		a.b =2; //p.f(X)
//		a.c =3; //private(x)
	
	
		a.method1(); //public(o)
//		a.method2(); //p.f(X)
//		a.method3(); //private(x)
		
	}
}
