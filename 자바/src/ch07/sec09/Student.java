package ch07.sec09;

public class Student extends Person {
//	필드선언
	public int studentNo;
	
//	생성자 선언
	public Student(String name , int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
//	메서드 선언
	public void study() {
		System.out.println("공부를 합시다");
	}
}
