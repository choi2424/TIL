package ch09.sec02.exam01;
//	중첩클래스


public class A {

//	인스턴스 멤버 클래스
	class B{
//		구성요소 , 메서드 , 생성자					
	}
	
//	인스턴스 필드 값으로 B객체 대입
	B field = new B();
	
//	생성자
	A(){
		B b = new B();
	}
	
//	인스턴스 메서드
	void method() {
		B b = new B();
	}
}
