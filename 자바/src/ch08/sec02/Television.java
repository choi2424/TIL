package ch08.sec02;

public class Television implements RemoteControl {
	@Override
	public void trunOn() {
		System.out.println("TV를 킵니다");
	}
}
