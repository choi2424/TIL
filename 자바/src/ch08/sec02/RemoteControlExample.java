package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
//		객체생성 불가능
//		RemoteControl remoteControl = new RemoteControl();
		
		RemoteControl rc;
		rc = new Television();
		rc.trunOn(); // Television클래스 구현 메서드 호출
		
		rc = new Audio();
		rc.trunOn(); // Audio클래스 구현메서드 호출
	}

}
