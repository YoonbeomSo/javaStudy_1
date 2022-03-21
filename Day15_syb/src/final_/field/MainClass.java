package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김범범");
//		kim.nation = "미국"; (x)
//		kim.name = "김마이클"; (x)
		kim.age =27;
		System.out.println("국적: "+ kim.nation); //대한민국
		System.out.println("이름: "+ kim.name); //김범범
		System.out.println("나이: "+ kim.age); //27
		
		Person park = new Person("박중국");
		park.age = 30;
		System.out.println("국적: "+ park.nation); //대한민국
		System.out.println("이름: "+ park.name); //박중국
		System.out.println("나이: "+ park.age); //30
	}

}
