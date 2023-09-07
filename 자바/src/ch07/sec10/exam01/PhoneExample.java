package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		추상클래스는 객체생성을 할 수가 없다.(규칙)
//		Phone phone = new Phone("홍길동");
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
