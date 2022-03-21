import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		//정수를 입력받아 1부터 입력받은 숫자까지의 누적합을 구하는 로직
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수: ");
		int target = scan.nextInt();
		int sum = 0;
		int n =1;

		do {
			sum+=n;
			n++;
		} while(n<=target);
		
//		while(n<=target) {
//			sum += n;
//			n ++;
//		}

		
		
		System.out.println("1부터 "+ target + "까지 누적합 : " + sum);

	}

}
