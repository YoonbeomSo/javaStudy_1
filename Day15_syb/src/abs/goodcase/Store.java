package abs.goodcase;

public class Store extends Headstore {
	
	
	public Store() {
		super();
	}

	//1. Overriding 필수
	public void orderApple() {
		System.out.println("사과의 가격은 2900원입니다.");
	}
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 3000원입니다.");
	}
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 3000원입니다.");
	}
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 4000원입니다.");
	}
	
	//2. 추상메서드(x) overriding이 필수는 아님.
	public void orderWaterMelon() {
		System.out.println("수박 쥬스의 가격은 4000원입니다.");
	}
	
	//3.static overriding 안됨
//	public void orderPeach() {
//		System.out.println("복숭아 쥬스의 가격은 4000원입니다.");
//	}
}
