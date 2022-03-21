
public class RandomExample {
	
	public static void main(String[] args) {

		//난수(랜던값)을 발생시키는 메서드 random()
		//0.0 이상 1.0미만의 랜덤 실수값을 가져옴

		double r = Math.random();   //random은 double값을 return함
//		System.out.println("랜덤값: "+ r);

		//정수 난수 생성하기
		int rn = (int)(r*10);
		System.out.println("정수 난수값: " + rn);
		
		
		System.out.println("신년 여행지 뽑기");
	
		if(r > 0.55) {
			System.out.println("모로코");
		}
		else if(r > 0.3) {
			System.out.println("상하이");
		}
		else {
			System.out.println("안감");
		}
		
		
		
		
		
		
	}
}
