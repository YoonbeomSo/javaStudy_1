
public class ForStarExample {
	
	public static void main(String[] args) {
		
		
		int floor = 5;
		//1
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============");
		
		
		//2
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < floor-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============");

		
		//3
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < floor-(i+1) ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============");
			
	}
}
