package ch07.sec10.exam02;

//	추상클래스는 abstract 키워드를 적용하면 된다.
//	추상메서드를 1개라도 가지고 있으면 , 클래스에 abstract 키워드를 적용해야한다.
public abstract class Animal {

//	메서드의 구성
	/*
	 1)head - void method()
	 2)body - {}
	 */
	
//	메서드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
//	추상메서드
	abstract void sound();
}
