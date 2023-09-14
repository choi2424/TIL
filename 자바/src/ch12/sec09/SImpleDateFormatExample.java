package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

//	날짜 데이터를 형식지정
public class SImpleDateFormatExample {
	
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째날");
		System.out.println(sdf.format(now));
		
		
	}
}
