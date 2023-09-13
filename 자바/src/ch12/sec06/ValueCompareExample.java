package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		
//		참조타입 변수 = 기본데이터타입 int형 값;
//		300 이라는 값이 힙영역에 메모리가 생성이 되어 저장되고, 그 곳의 주소가 할당된다.(Boxing)
		
//		-128~127 초과값일 경우 
		Integer obj1 = 300;
		Integer obj2 = 300;
		
//		값 비교시 == , != 사용하지말고 equals()메서드 사용할 것
		System.out.println("= : " + (obj1 == obj2)); // false
		System.out.println("equals() : " + obj1.equals(obj2)); // true . 값비교시 사용
		
//		-128~127 범위내의 값일 경우 
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println("= : " + (obj3 == obj4)); // true
		System.out.println("equals() : " + obj3.equals(obj4)); // true . 값비교시 사용
		
	}

}
