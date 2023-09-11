package ch09.sec04.exam03;

//	getter , setter 개념

public class A {
//	메서드
	public void method1(final int arg) { // final int arg. jdk 1.8 이후지원
//		로컬변수
		int var = 1;
//		var = 2; // 변경가능
//		로컬클래스
		class B{
//			메서드
			void method2() {
//				로컬변수읽기.
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
				
//				로컬 변수수정 불가능
//				arg = 2;
//				var = 2;
			}
		}
		
//		로컬 객체생성
		B b = new B();
		b.method2();
//		arg = 3;
//		var = 3;
	}
}
