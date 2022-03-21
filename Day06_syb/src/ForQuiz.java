
public class ForQuiz {

	public static void main(String[] args) {
	
		
		int dan = (int)(Math.random()*10);
		
		System.out.println("랜덤 구구단 "+dan+"단");
		System.out.println("------------------");
		
		for(int hang = 1; hang<10; hang++) {
			System.out.println(dan+" X "+hang+" = "+ dan*hang);
		}

	}
}
