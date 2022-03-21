
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};

		//기존 for 문
//		for(int i =0; i < weekDay.length; i++) {
//			System.out.println(weekDay[i] + "요일");
//		}
		
		
		//Enhanced for문(JAVA5부터 사용 가능)
		for(String day : weekDay) {
			System.out.println(day + "요일");
		}
		
		
		System.out.println("=========================");
		
		//향상된 for문을 사용하여 총점과 평균을 출력하세요
		int[] scores = {98,71,85,67,100,95};
		
		
		int sum = 0;
		
		for(int i : scores) {
			sum +=i;
		}
		System.out.println("총점 : " + sum);
		
		double avg = (double)sum / scores.length ;
		System.out.println("평균 : " + avg);
		
		
	}

}
