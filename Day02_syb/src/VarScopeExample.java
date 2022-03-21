
public class VarScopeExample {

	public static void main(String[] args) {
		
		//같은 타입의 변수를 선언할 떄는 콤마(,)로 나열 가능
		int num1 = 10, num2 =20;
		
		if(num1> 15) {
			int num3 = num1 + num2;
		}
//		int num4 = num1 + num3;(x)
		int num3 = 10; //블록을 벗어났기 때문에 만들 수 있음
		System.out.println(num3);
	}
}
