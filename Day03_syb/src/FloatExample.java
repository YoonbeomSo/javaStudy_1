
public class FloatExample {

	public static void main(String[] args) {
	
		float f1 = 7.12345F;     //상수 뒤에 F를 첨자해 float형으로 바꿔줘야함.
		double d1 = 7.12345;
		System.out.println(f1);
		
		float f2 = 1.234567891234F;     //상수 뒤에 F를 첨자해 float형으로 바꿔줘야함.
		double d2 = 1.234567891234;
		System.out.println("--------------------");
		System.out.println(f2);   // 1.2345679 까지 표현됨
		System.out.println(d2);   
	 
//		2132121344123 | 7321232123121
//		2.1321 x e^14 | 73212 x e^13
		float f3 = 3.1415e6F;  //3.1415 x 10^6
		double d3 = 2.213e-3;  //2.213 x 1.-3
		System.out.println("--------------------");
		System.out.println(f3);
		System.out.println(d3);
		
		

		
		
		
		
	}

}
