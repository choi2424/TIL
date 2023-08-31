package ch06.sec04;

public class StudentExample {

//	시작 메서드
	public static void main(String[] args) {
		
//		클래스 사용법.
		Student s1 = new Student(); // s1은 힙영역의 주소가 존재한다 . 주소를 찾아가서 정보(필드,메서드)를 사용하게 된다
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2변수가 Student 객체를 참조합니다.");
	}

}
