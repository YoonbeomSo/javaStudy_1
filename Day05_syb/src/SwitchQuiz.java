import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
	/*
	 * 직급을 입력하세요.
	 * [사원,대리,과장,차장,부장]
	 * >
	 * 대리의 급여는 300만원입니다./
	 * or
	 * 사워은(는) 없는 직급입니다.
	 * 직급을 다시 입력해주세요.
	 */
		Scanner i = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요.");
		System.out.println("[사원,대리,과장,차장,부장]");
		System.out.print("> ");
		String level = i.next();
		
		
		switch(level) {
		case "사원":
			System.out.println(level + "의 급여는 200만원입니다.");
			break;
		case "대리":
			System.out.println(level + "의 급여는 300만원입니다.");
			break;
		case "과장":
			System.out.println(level + "의 급여는 400만원입니다.");
			break;
		case "차장":
			System.out.println(level + "의 급여는 500만원입니다.");
			break;
		case "부장":
			System.out.println(level + "의 급여는 600만원입니다.");
			break;
		default:
			System.out.println(level + "은(는) 없는 직급입니다.\n직급을 다시 입력해주세요.");
		}
		
	}

}
