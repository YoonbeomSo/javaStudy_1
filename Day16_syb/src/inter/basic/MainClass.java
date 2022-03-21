package inter.basic;

public class MainClass {

	public static void main(String[] args) {
	
		//인터페이스는 객체를 생성할 수 없습니다.
//		Inter1 i1 = new Inter1();
		
		InterClass ic = new InterClass();
		
		System.out.println(Inter1.INCH);
		System.out.println(Inter2.ABC);
		ic.method1();
		ic.method2();
		ic.method3();
		System.out.println("=========================");
		
		/*
		 - 인터페이스 이름도 하나의 타입으로 취급할 수 있습니다.
		 - 인터페이스를 통해 상속 없이도 다형성을 구현할 수 있습니다.
		 */
		
		Inter1 i1 = ic; //Promotion: InterClass -> Inter1
		Inter2 i2 = new InterClass(); //InterClass -> Inter2
		
//		i1.method3();
//		i2.method3();
		
		InterClass icc = (InterClass)i1;
		InterClass icc2 = (InterClass)i2;
		icc.method3();
		icc2.method3();
	}

}
