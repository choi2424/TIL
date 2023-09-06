package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		
//		자동 타입변환
//		자식 Child객체의 멤버는 접근이 안됨
		Parent parent = new Parent();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2"; // 불가능
//		parent.method3(); // 불가능
		
//		강제 타입변환. 부모 , 자식 멤버 둘다 사용가능.
		Child child = (Child) parent;
		
		child.field2 = "date2";
		child.method3();
		
	}

}
