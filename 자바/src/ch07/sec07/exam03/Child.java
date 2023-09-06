package ch07.sec07.exam03;

//	형변환
//	상속관계시 재정의(overriding)된 메서드 호출 예제
public class Child extends Parent{
	
//	필드선언
	public String field2;
	
//	추가 메서드
	public void method3() {
		System.out.println("Child-method3()");
	}
}
