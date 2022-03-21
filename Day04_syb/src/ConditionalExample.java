
public class ConditionalExample {

	public static void main(String[] args) {
		
		//-4~5까지의 정수 난수값을 발생.
		int r = 5 - (int)(Math.random() * 10);
		System.out.println("랜덤값:" + r);
		
		//3항 조건연산자 (조건식? 연산식1 : 연산식2)
		int abs =(r>=0 ? r : -r);
		System.out.println("r의 절대값:" + abs);
	}

}
