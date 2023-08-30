package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
//		String 클래스의 초기값 설정
//		참조타입의 변수는 초기값을 null 로 한다
//		. : 참조연산자
		
		String hobby = ""; // null보다는 "" 빈문자열을 주로 사용한다.
		
//		이때 hobby의 값을 null로 바꾸면 에러가 떨어진다 null은 참조를 할수 없기때문이다
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열.");
		}
		

	}

}
