package poly.person;


public class Person {
	
	String name;
	int age;
	
	//생성자 선언
	Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println(this.info());
	}
	
	Person(String name) {
		this(name,1);
//		this.name = name;
//		this.age =1;
	}
	
	Person() {
		this("이름없음",0);
//		this.name = "이름없음";
//		this.age = 0;
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age ;
	}

}
