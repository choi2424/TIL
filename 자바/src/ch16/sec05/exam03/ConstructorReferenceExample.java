package ch16.sec05.exam03;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
//		람다식
//		Member m1 = person.getMember1((id) -> new Member(id));
//		메서드참조
		Member m1 = person.getMember1(Member :: new);  // new Member(String id)
		System.out.println(m1);
		System.out.println();
		
//		람다식 
//		Member m2 = person.getMember2((id,name) -> new Member(id,name));
//		메서드참조
		Member m2 = person.getMember2(Member :: new); // new Member(String id , String name)
		System.out.println(m2);
	}

}
