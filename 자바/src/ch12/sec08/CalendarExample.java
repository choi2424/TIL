package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
	
	public static void main(String[] args) {
//		추상클래스 : 객체생성 불가능.
		Calendar now = Calendar.getInstance();
//		날짜,시간의 부분정보 : Calendar.상수명
		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH)+ 1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY : strWeek = "월"; break; 
			case Calendar.TUESDAY : strWeek = "화"; break; 
			case Calendar.WEDNESDAY : strWeek = "수"; break; 
			case Calendar.THURSDAY : strWeek = "목"; break; 
			case Calendar.FRIDAY : strWeek = "금"; break; 
			case Calendar.SATURDAY : strWeek = "토"; break; 
			default : strWeek = "일"; 
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAMPM = (amPm == Calendar.AM) ?  "오전" : "오후";
		
		/*
		if(amPm == Calendar.AM) {
			strAMPM = "오전";
		}else {
			strAMPM = "오후";
		}
		*/
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%d년%d월%d일 %s요일 %s%d시%d분%d초",year,month,day,strWeek,strAMPM,hour,minute,second);
		
		
		 
	}
}
