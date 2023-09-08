package ch08.sec06;

public interface RemoteControl {

//	상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
//	추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	일반 메서드는 사용할 수가 없다
	
//	디폴트 인스턴스 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
		
	}
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교체합니다");
	}
}
