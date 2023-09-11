package ch09.sec07.exam02;

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
