package ch07.sec09;

public class InstanceofExample {

	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		
		/*
		if(person instanceof Student) {
			System.out.println("Student 객체입니다.");
		}else {
			System.out.println("Student 객체가 아닙니다.");
		}
		*/
		
//		personInfo(p1); 호출시 false , personInfo(p2); 호출시 true
		if(person instanceof Student) {
			Student student = (Student)person;
			System.out.println("studentNO : " + student.studentNo);
			student.study();
		}
		
//		jdk 12 version
		/*
		if(person instanceof Student student);
		System.out.println("studentNO : " + student.studentNO);
		student.study();
		*/
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
//		person instanceOf Student -> false
		personInfo(p1); // new 연산자가 힙영역에 생성한 기억장소의 주소가 전달
		
//		person instanceOf Student -> true
		Person p2 = new Student("손훙민",10);
		personInfo(p2);
	}

}
