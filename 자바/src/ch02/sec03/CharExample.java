package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {

//		char데이터타입 : 문자를 저장하기위한 목적으로 사용.
//		값은 유니코드 값으로 저장(0~65535)
//		값은 작은따옴표로 감싸야 하는 규칙
		
		char c1 = 'A'; // 내부적으로는 65 저장
		char c2 = 65; // 숫자로 저장해도 위와 동일한 의미.
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
	}

}
