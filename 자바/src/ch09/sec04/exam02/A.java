package ch09.sec04.exam02;

public class A {
	
//	중첩 클래스
	class B {}
	
//	메서드. 호출시에만 안에 내용이 메모리생성되고 , 호출이 끝나면 메모리 소멸.
	void useB() {
//		로컬클래스
		class B{
//			인스턴스 필드
			int field1 = 1;
			
//			정적필드 (Java 17부터 허용)
//			static int field2 = 2;
			
//			생성자 
			B() {
				System.out.println("B-생성자 실행");
			}
			
//			인스턴스 메서드
			void method1() {
				System.out.println("B-method1 실행");
			}
			
//			정적 메서드 (Java 17부터 허용)
//			static void method2() {
//				System.out.println("B-method2 실행");
//			}
			
		}
//		로컬 객체 생성
		B b = new B();
		
//		로컬 객체의 인스턴스 필드와 메서드 사용
		System.out.println(b.field1);
		b.method1();
		
//		Java 17 부터 허용
//		System.out.println(B.field2);
//		B.method2();
	}
}
