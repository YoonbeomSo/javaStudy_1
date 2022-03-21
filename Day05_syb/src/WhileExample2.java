import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//정수를 입력받아서 해당 정수가 소수(Prime Number)인지 판별하는 로직.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		//n은 소수를 판별할 정수값을 저장할 변수.
		int n = scan.nextInt();
		
		//i는 소수판별을 위해 입력한 정수 n을 나눠볼 피제수를 저장할 변수.
		int i = 2;
		
		//1과 자기자신 외의 값으로 나누어 완전히 나누어 떨어지면 안됨.
		while(n%i != 0) {                
			i++;
		}
		if(n==i) {
			System.out.println(n + "은(는) 소수입니다.");
		}else {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		scan.close();
		
	}
}
