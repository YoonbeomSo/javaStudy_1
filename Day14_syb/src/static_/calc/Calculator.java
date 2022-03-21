package static_.calc;

public class Calculator {
	
	private String color; //계산기별로 색깔이 다를 수 있기 때문에 color같은 변수는 일반변수로 공유되겠끔 한다.
	public static double pi; //pi값은 바뀌면 안되기 때문에 static변수로 공유되겠끔 사용해야한다.
	
	Calculator() {
		System.out.println("생성자 출력");
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	/*
	 - 메서드 내부에서 일반 멤버변수를 참조하지 않고, 범용성 있게 사용되는 
	  메서드는 static키워드를 사용하여 정적 메서드로 선언하는 것이 좋습니다.
	 */
	public static double areaCircle(int r) {
		pi = Math.PI;
		return r * r * pi;
	}
	

}
