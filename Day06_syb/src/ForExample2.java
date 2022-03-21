
public class ForExample2 {

	public static void main(String[] args) {
		
		//7~100까지의 정수 중 7의 배수를 모두 가로로 출력
		for(int i =7; i<101; i+=7) {
//			System.out.print(i + " ");
			System.out.printf("%d ", i);
		}
		
		System.out.println("\n-------------------");
		//1~100까지의 정수 중 6의 배수를 모두 가로로 출력
		for(int i=1; i<101; i++) {
			if(i % 6 ==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n-------------------");
		//1~100까지의 정수 중 8의 배수이면서 16의 배수가 아닌 수를 모두 가로로 출력
		for(int i=1; i<101; i++) {
			if(i%16 != 0 && i%8 == 0) {
				System.out.print(i + " ");
			}	
		}
		
		System.out.println("\n-------------------");
		//1~850까지의 정수 중 9의 배수의 개수를 출력하시오
		int su = 0;
		for(int i=1; i<851; i++) {
			if(i%9 == 0) {
				su+=1;
			}
		}
		System.out.println("9의 배수의 개수: "+ su);
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
	}
}	
