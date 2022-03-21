package abs.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 - 추상 클래스를 스스로 객체를 생성할 수 없습니다.
		 - 반드시 상속을 통해 클래스를 구체화시켜야 합니다.
		 */
		
//		Headstore h = new Headstore();
		Store s = new Store();
		s.orderApple();
		s.orderWaterMelon();
		s.orderPeach();
		
	}
}
