package ch09.sec07.exam02;

//	인터페이스를 상속형태로 사용
public class House implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
}
