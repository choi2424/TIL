package ch08.sec11.exam01;

//	바퀴(타이어) 제조업체
public class HankookTire implements Tire{

//	재정의
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
