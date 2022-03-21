package api.lang.string;

public class StringSubstring {

	public static void main(String[] args) {
		
		String ssn = "003030-4313131";
		System.out.println(ssn);
		
		/*
		 - substring() 메서드에 매개값으로 인덱스를 1개 지정하면
		  해당 인덱스부터 끝까지의 문자를 추출합니다.
		 */
		String last = ssn.substring(7); //7부터 끝까지
		System.out.println(last);
		
		/*
		 - substring() 메서드에 매개값으로 인덱스를 2개 지정하면
		  첫번째 매개값 이상 두번째 매개값 미만 인덱스의 문자열을 추출합니다.
		 */
		String first = ssn.substring(0,6); //0이상 6미만
		System.out.println(first);
		
	}

}
