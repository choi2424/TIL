package ch07.sec07.exam02;

//	형변환
//	상속관계시 재정의(overriding)된 메서드 호출 예제
public class Child extends Parent{
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
//	추가 메서드
	public void method3() {
		System.out.println("Child-method3()");
	}
}
