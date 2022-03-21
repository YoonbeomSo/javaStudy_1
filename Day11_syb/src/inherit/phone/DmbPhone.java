package inherit.phone;

public class DmbPhone extends Phone {
	
	int channel;
	
	DmbPhone(String amodel, String acolor, int achaanel) {
		model = amodel;
		color = acolor;
		channel = achaanel;
		
	}

	void turnOnDmb() {
		System.out.println("반송 수신을 시작합니다.");
	}
	
	void changeChannel(int achannel) {
		channel = achannel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		
		System.out.println("방송 수신을 종료합니다.");
	}
	
}