package inter.basic;


public interface Inter1 {
	
	//interface에 변수를 선언하면 자동으로 상수로 취급합니다.
	static final double INCH = 2.54; // public static final 생략해도 컴파일 시 생성
	
	//interface에 메서드를 선언하면 추상메서드로 취급됩니다.
	abstract void method1(); //abstract 생략해도 컴파일 시 생성
	
}
