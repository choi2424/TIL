package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//	날짜와 시간 비교
public class DateTimeCOmpareExample {
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 a HH시mm분ss초");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0,0);
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021,12,31,0,0,0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
//		startDateTime가 endDateTime보다 이전 날짜인지?
		if(startDateTime.isBefore(endDateTime)) { // 이전 날짜인지?
			System.out.println("진행중입니다");
		}else if(startDateTime.isEqual(endDateTime)) {// 동일 날짜인지?
			System.out.println("종료합니다");
		}else if(startDateTime.isAfter(endDateTime)) {// 이후 날짜인지?
			System.out.println("종료했습니다.");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonths = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.printf(
				"남은년 :%d\n남은월 :%d\n남은일 :%d\n남은시 :%d\n남은분 :%d\n남은초 :%d\n"
				,remainYear,remainMonths,remainDay,remainHour,remainMinute,remainSecond);
	}
}
