import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {

		/*
		 * ex. 
		 * 돈을 넣어주세요 : 200
		 * 돈이 부족합니다. 최소 500원을 넣어주세요.
		 * 남은 음료수의 개수는 5개입니다.
		 * ==========================
		 * 돈을 넣어주세요 : 500
		 * 음료수를 받았습니다.
		 * 남은 음료수의 개수는 4개입니다.
		 * ==========================
		 * 돈을 넣어주세요 : 2300
		 * 음료수를 받았습니다.
		 * 거스름돈을 300원 받았습니다.
		 * 남은 음료수의 개수는 0개입니다.
		 * 음료수가 다 떨어졌습니다. 판매를 중지합니다.
		 * ==========================
		 * 
		 */

		int beverage = 5;
		int price = 500;
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print("돈을 넣어주세요 : ");
			int money = scan.nextInt();
			
			int EA = money/price; 
			
			if(money < price) {
				System.out.println("돈이 부족합니다. 최소 500원을 넣어주세요.");
				System.out.println("남은 음료수의 개수는" + beverage + " 입니다.");
			}else if(money > (beverage * price)) {
				System.out.println("음료수를 받았습니다.");
				System.out.println("거스름 돈 " + -1*(beverage*price-money) + " 을 받으세요");
				beverage -= EA;
			}else {
				System.out.println("음료수를 받았습니다.");
				System.out.println("거스름 돈 " + money%price + " 을 받으세요");
				beverage -= EA;
				System.out.println("남은 음료수의 개수는 " + beverage +" 입니다.");
			}
			if (beverage <= 0) {
				System.out.println("음료수가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
				}
			
		}//end while
		scan.close();
		
	}//end main
}
