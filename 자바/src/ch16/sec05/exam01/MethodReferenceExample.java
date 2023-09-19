package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
//		1)정적메서드일 경우
//		람다식
//		person.action((x,y) -> Computer.staticMethod(x, y) );
		
//		메서드 참조
		person.action(Computer :: staticMethod);
		
//		2)인스턴스 메서드일 경구
		Computer computer = new Computer();
//		람다식
		person.action((x,y) -> computer.instanceMethod(x, y));
//		메서드 참조
		person.action(computer :: instanceMethod);
		
		
	}

}
