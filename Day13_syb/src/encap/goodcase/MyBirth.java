package encap.goodcase;

public class MyBirth {

	/*
	 *  은닉(캡슐화)을 사용하려면 데이터 참조를 제한할 멤버변수의
	 *  앞에 private제한자를 붙인다.
	 */
	private int year;
	private int month;
	private int day;
	
	
	//alt + shift + s || 마우스 우클릭 Sourse
	//>> generate constructors using filds 
	public MyBirth(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public MyBirth() {}
	
	void dateInfo() {
		System.out.printf("내 생일은 %d년%d월%d일 입니다.\n",this.year, this.month, this.day);
	}

	
	
	/*
	 *  - 은닉된 멤버변수에 접근하기 위해서는
	 *  클래스 설계자가 미리 만들어 놓은 setter/getter메서드를 
	 *  사용하여 데이터에 접근해야 합니다.
	 */


	/*  
	 *  - setter메서드 선언.
	 *  1. setter메서드는 은닉변수에 값을 저장시키기 위한 메서드입니다.
	 *  2. 메서드의 접근제한자를 public으로 설정하여 이름은 일반적으로
	 *  set + 멤버변수이름으로 지정합니다.
	 */
	public void setDay(int day) {
		if (day < 1 || day > 31) {
			System.out.println("잘못된 일수 입력입니다.");
		}else {
			this.day = day;
		}
	}
	
	/*
	 * - getter 메서드 선언.
	 * 1. getter메서드는 은닉변수의 값을 얻어낼 때 사용하는 메서드입니다.
	 * 2. setter와 마찬가지로 public제한으로 외부에 메서드를 공개하고
	 * 이름은 일반적으로 get + 멤버변수이름으로 지정합니다.
	 */
	public int getDay() {
		return this.day;
	}
	
	
	/*
	 *  month와 year의 setter/getter메서드를 선언하세요.
	 *  month: 1~12
	 *  year: 0~3000
	 *  alt + shift + s 활용
	 */
	
	
	public void setMonth(int month) {
		if (month<1 || month>12) {
			System.out.println("잘못된 달수 입력입니다.");
		}else {
			this.month = month;
		}
	}
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		if (year<0 || year>3000) {
			System.out.println("잘못된 년수 입력입니다.");
		}else {
			this.year = year;
		}
	}
	
	public int getYear() {
		return this.year;
	}


	
	
	
}//end class
