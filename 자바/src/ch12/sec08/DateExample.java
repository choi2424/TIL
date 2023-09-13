package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateExample {
	
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1); // Wed Sep 13 14:31:21 KST 2023
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String strNow2 = sdf.format(now); // 2023년09월13일 14시35분43초
		System.out.println(strNow2);
		
		
	}
}
