import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌를 등록합니다.");
		
		System.out.println("이름: ");
		String name = scan.next();
		System.out.println("비밀번호: ");
		int passwd = scan.nextInt();
		System.out.println("입금액: ");
		int balance = scan.nextInt();
		
		Account acc = new Account(name, passwd, balance);
		
		while(true) {
			System.out.println("\n메뉴을 입력하세요.");
			System.out.println("1. 예금 | 2. 출금 | 3.잔액조회");
			System.out.print("> ");
			int menu = scan.nextInt();
			
			if(menu==1) {
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.println(" >");
				int pw = scan.nextInt();
				
				if(pw == acc.passwd) {
					System.out.println("입금액을 입력하세요.");
					System.out.print("> ");
					int money = scan.nextInt();
					//입금기능 메서드호출
					acc.deposit(money);
					System.out.println(money + "원 입금이 완료되었습니다.");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else if(menu==2) {
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.println(" >");
				int pw = scan.nextInt();
				
				if(pw == acc.passwd) {
					System.out.println("출금액을 입력하세요.");
					System.out.println("> ");
					int money = scan.nextInt();
					if(money > acc.balance) {
						System.out.println("잔액이 부족합니다.");
					}else {
						//출금 가능 메서드 호출
						acc.withDraw(money);
						System.out.println(money + "원 출금 완료되었습니다.");
					}	
				}else { 
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else if(menu==3) {
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.print("> ");
				int pw = scan.nextInt();
				if(pw == acc.passwd) {
					int bal = acc.getBalance();
					
					System.out.println(acc.name + "님의 계좌 잔액은"+bal+"입니다.");	
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				break;
			}
		}//end while
		scan.close();	
		
	}//end main
	
	void input () {
		
	}
	
}//end class
