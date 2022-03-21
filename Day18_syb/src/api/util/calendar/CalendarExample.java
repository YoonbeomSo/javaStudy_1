package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 추상 클래스이기 때문에 new로 객체 생성 안됨.

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 1월이 0으로 설정되어 있음.
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일이 1 숫자로 가져옴
//				System.out.println(week);

		String strWeek = null;

		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일입니다.");
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + strWeek + "요일");

	}

}
