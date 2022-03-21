
public class CastingOpertator {

	public static void main(String[] args) {
	
		char c = 'B';
		int i =2;
		
		char cc = (char)(c + i);
		int ii = c + i; 
		
		System.out.println(cc);     // D 
		System.out.println(ii);     // 68
		
		int j =10;
		double d = j/4.0;           //4를 double형으로 바꿔서 double형으로 계산
		System.out.println(d);      //2.5
		
		
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);   //int보다 작은 변수의 연산은 자동으로 int형으로 변환된다.
		
		System.out.println(b3);      //110
		
	}

}
