package ch09.sec04.exam01;

public class A {
//	생성자
	A(){
//		로컬 클래스 선언
		class B{}
		
//		로컬 객체생성
		B b = new B();
	}
	
//	메서드
	void method() {
		class B{}
		
//		로컬 객체생성
		B b = new B();
	}
	
}
