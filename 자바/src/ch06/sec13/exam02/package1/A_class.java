package ch06.sec13.exam02.package1;

// 생성자 접근자 예제. public, private, 생략시(default)
// 자신의 클래스에서 생성자의 접근자는 의미가 없다.
public class A_class {
	
	// 필드선언
	// 자신의 클래스를 가지고 객체 생성 가능.
	A_class a1 = new A_class(true);
	A_class a2 = new A_class(1);
	A_class a3 = new A_class("안녕안녕안녕");
	
	// 생성자 선언
	public A_class(boolean b) {};
	
	// 접근자가 생략되면, default 의미.
	A_class(int b) {};
	
	private A_class(String S) {};
	
	
	
}
