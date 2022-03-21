package static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		
		System.out.println("일반 멤버변수 a:" + c1.a); //1
		System.out.println("정적 멤버변수 b:" + c1.b); //1
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		System.out.println("일반 멤버변수 a:" + c1.a); //1
		System.out.println("정적 멤버변수 b:" + c1.b); //2
		
		
		/*
		 - static 멤버는 객체와 무관하기 때문에 클래스 이름만으로 참조하여 사용합니다.
		 */
		Count.b++;  //c1.b++과 c2.b++은 b가 static 변수이기 때문에 같다. 따라서 Count.b++라고 하는 것이 옳다.
		
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
		
		
	}
}
