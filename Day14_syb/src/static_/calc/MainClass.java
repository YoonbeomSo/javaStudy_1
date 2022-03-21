package static_.calc;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println("===은닉된 일반변수 color 출력===");
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		System.out.println("===바뀌지 않는 정적변수 pi를 사용한 원의 넓이 출력===");
		System.out.println(Calculator.areaCircle(4));
	}
}
