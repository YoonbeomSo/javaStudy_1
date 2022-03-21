import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		/*
		 * 1. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
		 * 2. 2가지의 정수를 1~100사이의 난수를 발생 시켜 
		 * 	  지속적으로 문제를 출제한 후 정답을 맞추면 반복문을 탈출시키세요
		 * 3. ex. 27 + 84 =??
		 * 	  [문제를 그만 푸시려면 0을 입력하세요.]
		 * 	  프로그램을 종료합니다.
		 *    ------------------------------
		 *    정답 횟수 : ?회
		 *    오답 횟수 : ?회
		 */

		Scanner scan = new Scanner(System.in);
		int su1 = 0;
		int su2 = 0;

		while(true) {
			int r1 = (int)(Math.random()*100)+1;   //0~100이하
			int r2 = (int)(Math.random()*100)+1;   //0~100이하	
			System.out.println(r1 + "+" + r2 + "= ??");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print("답 입력 > ");

			int answer = scan.nextInt();
			int solution = r1+r2;

			if(answer == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("-----------------");
				System.out.println("정답 횟수 : "+ su1);
				System.out.println("오답 횟수 : "+ su2);
				break;
			}else if (answer == solution){
				System.out.println(solution+"정답입니다.");
				su1++;
			}else {
				System.out.println(answer+"오답입니다.");	
				su2++;
			}
		}//end while
		scan.close();

	}

}
