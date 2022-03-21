
public class IfExample1 {

	public static void main(String[] args) {
		
		//0~100까지의 정수형 난수를 발생.
		int point = (int)(Math.random() * 101);
		System.out.println("점수:"+ point);

		if(point >= 60) {
			System.out.println("60점 이상 \n시험 합격");
		} else {
			System.out.println("60점 이하 \n시험 불합격");
		}
		
		System.out.println("수고하셨습니다");
	
	}//end main

}//end class
