package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {	
		RemoteControl rc;
			
//		tv 객체를 생성하고 , 인터페이스 변수에 대입 . 다형성
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(4);
		rc.turnOff();
		
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
	}

}
