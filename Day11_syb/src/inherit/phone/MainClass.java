package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		/* 
		 * 문제. 다음과 같이 프로그래밍 하시오.
		 * 모델: 햅틱
		 * 색상: 메탈그레이
		 * 채널: 10
		 * 전원을 켭니다.
		 * 벨이 울립니다.
		 * 전화를 끊습니다.
		 * 방송 수신을 시작합니다.
		 * 채널 7번으로 변경합니다.
		 * 방송 수신을 종료합니다.
		 * 전원을 끕니다.
		 */
		
		//Dmb폰 객체 생성
		DmbPhone dp = new DmbPhone("햅틱", "메탈그레이", 10);
		//Phone클래스에서 상속받은 멤버 변수에 접근
		System.out.println("모델: " + dp.model);
		System.out.println("색상: " + dp.color);
		//DmbPhone에서 선언한 멤버 변수에 접근
		System.out.println("채널: " + dp.channel);
		//Phone에서 상속받은 메서드 호출
		dp.powerOn();
		dp.ring();
		dp.hangUp();
		//DmbPhone에서 선언한 메서드 호출
		dp.turnOnDmb();
		dp.changeChannel(7);
		dp.turnOffDmb();
		//Phone에서 상속받은 메서드 호출
		dp.powerOff();

	}

}
