package api.util.arrays;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		
		char[] arr1 = {'j', 'A', 'V', 'A'};
//		char[] arr2 = arr1; //주소를 복사하는 방법
		
		//Arrays.copyOf()
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); //Arrays.copyOf(복사할 배열,복사할 배열 길이(개수))
		arr2[2] = 'Z';
		
		//Arrays.toString()
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));

		//Arrays.copyOfRange()
		char[] arr3 = Arrays.copyOfRange(arr1,1,3); //1이상3미만
		System.out.println("arr3: " + Arrays.toString(arr3));
		int[] arr4 = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 6);
		System.out.println("arr5: " + Arrays.toString(arr5));
	}

}
