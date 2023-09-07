package ch08.sec02;

//	클래스가 인터페이스를 상속받는 경우
//	인터페이스의 추상메서드를 상속받는 클래스는 반드시 구현(재정의) 해야한다 (규칙).
public class Audio implements RemoteControl {
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다");
	}
}
