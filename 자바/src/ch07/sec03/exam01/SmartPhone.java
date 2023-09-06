package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super(); // 컴파일과정에서 부모클래스의 기본생성자를 호출하는 목적으로 자동생성되지만 , 수동으로 작성해도 된다
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}
