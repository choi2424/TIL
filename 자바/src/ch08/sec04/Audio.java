package ch08.sec04;

public class Audio implements RemoteControl {
	
//	인터페이스를 상속받는 클래스는 인터페이스의 추상 메서드를 구현해야 하는 문법적인 규칙때문에 이 작업을 툴에서 제공해주고있다
	
//	필드 현재 오디오 볼륨상태
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}


	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;	
		}
		System.out.printf("현재 볼륨 상태는 %d 입니다\n",volume);	
		
	}

	

}
	