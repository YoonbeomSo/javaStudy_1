package import_ex;

/*
 * 다른 패키지에 있는 클래스를 사용하려면 반드시 package 선언부 아래,
 * 그리고 class 선언부 위에 import선언을 통해 해당 클래스의
 * 전체 경로(패키지명까지 포함된 경로)를 적어줘야 합니다. *
 */
//import fruit.Apple;
//import fruit.Banana;
import fruit.*;//fruit 패키지 전체 클래스를 import
import hello.bye.Bye;
import hello.hi.Hi;

public class ImportExample {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Banana b = new Banana();
		Test t = new Test();
		
		Hi h = new Hi();
		Bye y = new Bye();
		
	}

}
