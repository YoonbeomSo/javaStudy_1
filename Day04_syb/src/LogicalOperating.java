
public class LogicalOperating {

	public static void main(String[] args) {
		
		int x = 10, y = 20 ;
		
		if((x != 10) & (++y ==21)) {
			System.out.println("연산결과가 참");
		}else {
			System.out.println("연산결과가 거짓");
		}
		System.out.println("x: "+ x + ", y: "+y);
		
		
		if ((x ==10) | (++y ==21)) {
			System.out.println("연산결과가 참");
		}else {
			System.out.println("연산결과가 거짓");
		}
		System.out.println("x: "+ x + ", y: "+y);
		
		
		
		System.out.println("--------------------");
		
		int a = 10, b = 20 ;
		
		if((a != 10) && (++b ==21)) {                 //좌항이 false이기 때문에 ++b(우항) 실행하지 않음
			System.out.println("연산결과가 참");
		}else {
			System.out.println("연산결과가 거짓");
		}
		System.out.println("a: "+ a + ", b: "+b);
		
		
		if ((a ==10) || (++b ==21)) {
			System.out.println("연산결과가 참");
		}else {
			System.out.println("연산결과가 거짓");
		}
		System.out.println("a: "+ a + ", b: "+b);
		
		
		
		
		
	}

}
