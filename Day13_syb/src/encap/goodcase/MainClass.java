package encap.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth b = new MyBirth();
		
		/*
		 * b.year = 2021; 
		 * b.month = 15; 
		 * b.day = -31;
		 * 
		 * System.out.println(b.year);
		 */

		b.setDay(35);	
		b.setMonth(13);
		b.setYear(2021);
	
		b.dateInfo();
		
	}
	

}
