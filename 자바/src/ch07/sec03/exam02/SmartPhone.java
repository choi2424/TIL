package ch07.sec03.exam02;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super(model, color); // 부모클래스가 기본생성자 생성되지 않으므로, 매개변수가 있는 부모클래스의 생성자를 호출한다.
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}
