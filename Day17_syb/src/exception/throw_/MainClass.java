package exception.throw_;

public final class MainClass {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.deposit(10000);
		System.out.printf("입금 후 잔액: %d원\n", acc.getBalance());
		
		try {
			acc.withDraw(11000);
		} catch (BalanceInsufficientException e) {
			/*
			  - 예외 클래스가 제공하는 getMessage()메서드는
			   예외의 원인 멧시지를 String타입으로 리턴합니다.
			   자바 표준 API에서 제공하는 다양한 예외클래스들은
			   각각의 예외 원인 메세지가 기본적으로 객체 안에
			   저장되어 있습니다.
			 */
			System.out.println((e.getMessage()));
		}
		System.out.printf("출금 후 잔액: %d원\n", acc.getBalance());
		
	}
}
