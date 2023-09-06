package ch07.sec05.exam02;

//	메서드에 final 키워드를 사용시 재정의(overriding)를 할수가 없다
public class Car {

//	필드 선언
	public int speed;
	
//	메서드 선언
	public void speedUp() {
		speed += 1;			
	}
	
//	final메서드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
