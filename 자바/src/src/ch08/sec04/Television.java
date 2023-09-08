package ch08.sec04;

public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		/*
		this.volume = volume;
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}
		*/
		this.volume = (volume > RemoteControl.MAX_VOLUME) ? RemoteControl.MAX_VOLUME :
            (volume < RemoteControl.MIN_VOLUME) ? RemoteControl.MIN_VOLUME :
            volume;
		
		System.out.printf("현재 tv볼륨 상태는 %d 입니다\n",volume);

		
	}
	
	
	
}
