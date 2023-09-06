package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		/*
		child 객체에서 접근이 가능한 메서드
		자동형변환된 parent객체에서 접근이 가능한 메서드
		차이가 있다.
		*/
		
		Child child = new Child();
		
//		child.method1(); // Parent
//		child.method2(); // 재정의
//		child.method3(); // 추가사용
//		child.method2(); // Parent클래스 method2()은 목록에서 숨겨져 있음. super.method2() 호출
		
//		자동 타입변환
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // Parent 클래스의 method2() 호출
//		parent.method3(); // 호출 불가능
		
		
	}

}
