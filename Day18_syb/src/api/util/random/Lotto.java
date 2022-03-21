package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * <로또 번호 출력하기>
		 * 1. 로또 번호 6개를 담을 배열을 생성하세요. 
		 * 2. 정수 1~45 범위의 난수를 6개 발생시켜 배열에 담으세요
		 * 3. Arrays.sort(배열이름) 메서드를 사용하여 배열의 오름차순으로 정돈하세요.
		 */
		Random r = new Random();

		int[] lotto = new int[6];
		int k = 0;
		boolean dis = false;

		while (true) {
			int rn = r.nextInt(45) + 1; // 1~45
			// 중복 판별 로직
			for (int i = 0; i <= k; i++) {
				if (lotto[i] == rn) {
					dis = false;
					break;
				}
				dis = true;
			}//end for
			if (dis) {
				lotto[k] = rn;
				k++;
			}
			if (k == 6) {
				break;
			}

		} // end while
		Arrays.sort(lotto); // 오름차순 정렬

		System.out.println(Arrays.toString(lotto));

	}// end main

}// end class
