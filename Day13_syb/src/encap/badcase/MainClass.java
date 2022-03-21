package encap.badcase;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth b = new MyBirth();
		
		b.year = 2021;
		b.month = 13;   //12월이 초과되어도 입력이 가능함
		b.day = 35;     //범위지정이 불가능함 -> 은닉으로 제어 필요
		
		b.dateInfo();
				
		
	}
}
