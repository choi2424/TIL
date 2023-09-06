package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	
//	상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
//	상태필드 선언
	public int flyMode = NORMAL;
	
	@Override
		public void fly() {
		
//		flyMode = (flyMode < 2) ? System.out.println("초음속 비행합니다.") : super.fly();
		
		
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); // 부모클래스의 메서드 호출.. this 자기자신의 클래스명을 의미			
		}
		
		}
}
