package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("1번째 데이터: ");
			String data1 = sc.next();
			System.out.print("2번째 데이터: ");
			String data2 = sc.next();

			// NumberFormatException 발생 가능!(순수한 정수가 입력되어야 함)
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);

			// ArithmeticException 발생 가능! (0으로 받았을 경우)
			int result = val1 / val2;
			System.out.println(val1 + "/" + val2 + "=" + result);

			// NullPointException 발생 가능!
			String str = null;
			str.charAt(0);

			// Exception클래스는 모든 예외를 일괄처리할 수 있습니다.
		} catch (NumberFormatException e) {
			System.out.println("데이터를 숫자만 넣어주세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러가 발생했습니다.");
			System.out.println("확인 후 신속히 처리하겠습니다.");
		} finally {
			sc.close();
		}

	}

}
