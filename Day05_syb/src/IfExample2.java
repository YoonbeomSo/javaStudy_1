import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("> ");
		int point = sc.nextInt();
		
		if(point >=90) {
			if(point > 100) {
				System.out.println("점수를 잘 못 입력했습니다.");
			}else if(point >= 95) {
				System.out.println("당신은 A+학점 입니다");
			}else {
			System.out.println("당신은 A학점 입니다.");
			}
		} else if(point >= 80) {
			System.out.println("당신은 B학점 입니다.");			
		} else if(point >= 70) {
			System.out.println("당신은 C학점 입니다.");			
		} else if(point >= 60) {
			System.out.println("당신은 D학점 입니다.");
		} else {
			System.out.println("당신은 F학점 입니다.");
			System.out.println("당신은 재수강 대상 입니다.");
			
		}
		
	}
}
