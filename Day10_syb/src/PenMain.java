
public class PenMain {

	public static void main(String[] args) {
		
		//Pen의 객체를 생성하여 기능과 속성을 사용하려면
		//설계용 클래스를 로딩시켜 Pen객체를 생성해야 합니다.
		Pen blackpen = new Pen();
		
		//객체의 기능과 속성을 사용하기 위해서는
		//참조 연산자(.)를 사용합니다.
		blackpen.color = "검정";
		blackpen.price =  500;
		blackpen.write();
		blackpen.info();
		
		
		Pen redpen = new Pen();	
		redpen.color = "빨강";
		redpen.price =  500;
		redpen.write();
		redpen.info();
		
	
		System.out.println(redpen);
		System.out.println(blackpen);
		
		
		//bluePen객체를 생성하여 write()를 호출하여
		//"파랑색 글을 씁니다."를 출력하세요.
		Pen bluepen = new Pen();
		bluepen.color = "파랑";
		bluepen.write();
		
		
		
	}

}
