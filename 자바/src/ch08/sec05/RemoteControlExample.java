package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {	
		RemoteControl rc;
			
//		tv 객체를 생성하고 , 인터페이스 변수에 대입 . 다형성
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(4);

//		디폴트 메서드 호출 , 재정의된 메서드 호출
		rc.setMute(true);
		rc.setMute(false);

		rc.turnOff();
		
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		
//		디폴트 메서드 호출 , 재정의된 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		rc.turnOff();
		
		
	}

}
