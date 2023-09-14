package ch12.sec10;

import java.util.regex.Pattern;

//	정규식 예제 - 문자열데이터에 패턴검사를 하는 문법
public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data); 
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		String a = (Pattern.matches(regExp, data)) ? "정규식일치" : "정규식불일치" ;
		System.out.println(a);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // e메일 정규식
		data = "dngel@mycompanycom"; // e메일에 .이 빠져있음
		
		boolean result2 = Pattern.matches(regExp, data);
		if(result2) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}
