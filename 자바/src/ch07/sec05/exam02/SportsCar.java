package ch07.sec05.exam02;


public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		super.speedUp();
	}
	
	/* stop() 메서드는 재정의 안됨. 부모클래스에서 final 키워드가 선언되어 있음
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
