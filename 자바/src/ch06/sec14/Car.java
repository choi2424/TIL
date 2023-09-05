package ch06.sec14;

// getter , setter 예제
// 목적 필드를 private접근자로 사용하며, 직접접근을 막고,
// getter , setter 메서드를 통한 간접접근으로 사용하고자 한다
// 직접접근 : myCar.speed = -50;

public class Car {

//	필드선언
	private int speed;
	private boolean stop; 
	
//	Getter
	public int getSpeed() {
		return speed;
	}
	
//	Setter
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}
}
