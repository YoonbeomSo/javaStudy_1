import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {
		/*
		 * 1.양의 정수를 입력받아서 그 수가 홀수라면
		 * "x는 홀수입니다.", 짝수라면 "x는 짝수입니다."가
		 * 출력되도록 조건문을 활용하여 코드를 만들어보세요.
		 * 2. 만약 사용자가 0을 입력하면 "0입니다.", 음수를
		 * 입력하면 "음의 정수입니다."를 출력하도록 조건문을
		 * 수정해보세요.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		System.out.print(" > ");
		int number = scan.nextInt();
		
		if(number < 0){
			System.out.println("음의 정수입니다.");
		}else {
			if(number == 0) {
				System.out.println("0 입니다.");
			}else if(number % 2 == 0) {
				System.out.println(number + "는 짝수입니다.");
			}else {
				System.out.println(number + "는 홀수입니다.");
			}
		}
	}

}
