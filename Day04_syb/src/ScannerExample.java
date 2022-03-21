import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		//1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너 클래스가 가지고 있는 입력메서드들을
		//   사용하여 데이터를 입력받음.
		System.out.println("이름을 입력하세요.");
		System.out.print("> ");
		String name = scan.next();
		
		System.out.println("나이를 입력하세요");
		System.out.print("> ");
		int age = scan.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
	
		//3. 스캐너의 메모리 자원을 반납한다.
		scan.close();
		
	
	}

}
