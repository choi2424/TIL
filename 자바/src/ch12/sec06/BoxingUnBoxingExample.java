package ch12.sec06;

//	박싱과 언박싱 예제
//	형변환 : 스택영역 -> 힙영역 , 힙영역 -> 스택영역
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
//		Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
//		UnBoxing
		int value = obj;
		System.out.println("value : " + value);
		
//		연산시 UnBoxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
