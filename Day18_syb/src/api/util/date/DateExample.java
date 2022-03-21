package api.util.date;

import java.util.Date;

//java.text.SimpleDateFormat : 날짜의 표현형식을 바꿔주는 라이브러리 
import java.text.SimpleDateFormat;

public class DateExample {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));

		SimpleDateFormat yb = new SimpleDateFormat("yy-MM-dd a HH:mm:ss");
		System.out.println(yb.format(date));

		SimpleDateFormat yb1 = new SimpleDateFormat("오늘은 E요일 입니다. 오늘은 1년 중 D번째 날입니다.");
		System.out.println(yb1.format(date));

		
	}
}
