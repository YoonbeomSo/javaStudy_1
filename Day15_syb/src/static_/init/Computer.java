package static_.init;

public class Computer {

	public static String company = "LG";
	public static String model = "gram";
	public static String info;
	public int price;
	
	
	public Computer() {
		System.out.println("생성자가 호출됨.");
		this.price = 1000000;
//		this.info = company + "-" + model ;
	}
	
	//정적 변수의 초기화를 위해서는 정적 초기화자를 사용해야 합니다.
	static {
		System.out.println("정적 초기화자 호출!");
		info = company + "-" + model;
//		price = 1000000;(x) //static변수만 사용가능
	}
	
}
