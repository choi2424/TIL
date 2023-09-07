package ch07.sec10.exam02;

//	추상메서드가 있는 추상클래스를 상속 받는 경우 자식클래스는 추상메서드를 재정의해야한다
public class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹");
	}
	
}
