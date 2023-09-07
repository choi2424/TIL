package ch07.sec08.exam01;

//바퀴(타이어) 제조업체
public class KumhoTire extends Tire{

//	재정의
	@Override
	public void roll() {
		System.out.println("금호 타이어가 회전합니다.");
	}
}
