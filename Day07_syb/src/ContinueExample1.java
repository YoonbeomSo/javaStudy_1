
public class ContinueExample1 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i ==5) {
				continue;
			}
			System.out.println(i + "");
		}

		System.out.println("\n짝수 빼고 출력");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) continue;
			System.out.println(i + " ");
		}
		
	}
}
