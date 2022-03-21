package modi.member.pac1;

public class B {

	public B() {
	
		A a = new A();
		
		a.a =1; //public(o)
		a.b =2; //p.f(o)
//		a.c =3; //private(x)
	
	
		a.method1(); //public(o)
		a.method2(); //p.f(o)
//		a.method3(); //private(x)
		
	}
	
}
