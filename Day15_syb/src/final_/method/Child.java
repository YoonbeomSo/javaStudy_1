package final_.method;

public class Child extends Parent{

	@Override
	public void method1() {}
	public void method2() {}
//	public void method3() {} (x)
	
	public Child() {
		method1();
		method2();
		method3(); //상속은 가능
	}
	
	
	

}
