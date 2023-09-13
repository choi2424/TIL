package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

//	미국 L.A 시간 읽어오기
public class LosAngelesExample {
	
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("현재 LA의 시간은 %s%d시%d분%d초",strAmPm,hour,minute,second);
	}
}
