
public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 데이터를 작은 데이터타입으롤 변환하려면
		 * 반드시 캐스트 연산자(type)를 사용하여
		 * 명시적으로 형 변환을 해야합니다. (Downcasting)
		 */	
		int i = 72;
		char c = (char)i;    //int -> char 강제 형 변환
		System.out.println("72의 유니코드문자 : " + c);    //72의 유니코드문자 : H
		
		
		/*
		 * 강제 형변환의 경우 데이터 손실이 일어날 가능성이
		 * 있기 때문에 명시적으로 타입을 변환합니다.
		 */
		double d = 4.83123;
		int j = (int)d;
		System.out.println(j);
		
		/*
		 * 강제 형 변환시 주의점은 해당 데이터 타입이 
		 * 받아들일 수 있는 범위가 아닌 데이터가 들어오면
		 * 오버플로, 언더플로가 일업납니다.
		 */
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);
		
	}
}
