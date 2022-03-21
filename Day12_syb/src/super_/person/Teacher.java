package super_.person;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject) {
		//super()또는 this()를 기술하지 않으면
		//자동으로super()을 생성한다.	
		super(name, age);
//		this.name = name;
//		this.age = age;
		
		this.subject = subject;
	}
	
	String info() {
		return super.info() + age + ", 과목: " + subject ;
	}
}
