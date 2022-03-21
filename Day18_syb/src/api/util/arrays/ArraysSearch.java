package api.util.arrays;

import java.util.Arrays;

public class ArraysSearch {

	public static void main(String[] args) {
		
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		
		//Arrays.sort() : 배열의 데이터를 오름차순으로 정렬하는 메서드 
		Arrays.sort(scores2);
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		
		//Arrays.binarySearch() : 배열 내부데이터의 인덱스번호를 탐색하는 메서드 
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 저장된 인덱스 번호: " + index);
		
		//Arrays.equals(배열1, 배열2) : 배열 비교 -> true or false
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};		
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("배열의 각 항목이 일치함.");
		}else {
			System.out.println("배열의 각 항목이 일치하지 않음.");
		}

	}

}
