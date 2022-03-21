
public class UnaryExample {

	public static void main(String[] args) {
		
		//증감연산자 ++, --
		int i = 1;
		int j = i++; //후위 연산자

		System.out.println("i의 값: " + i);   //2
		System.out.println("j의 값: " + j);   //1
		System.out.println("-----------------");
		
		int x = 1;
		int y = ++x;  //전위 연산자
		System.out.println("x의 값: " + x);   //2
		System.out.println("y의 값: " + y);   //2
		
		
		
	}

}
