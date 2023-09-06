package ch07.sec04.exam01;

public class Computer extends Calculator {
	
	@Override // Annotation . 컴파일러에게 재정의된 메소드임을 제공하는 목적
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}
	
}
