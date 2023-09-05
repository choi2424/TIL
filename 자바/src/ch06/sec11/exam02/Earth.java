package ch06.sec11.exam02;

// 상수선언예제
public class Earth {

//	 	특정한 불변값을 이름으로 정의. 즉 값이 주인공. 값을 변경 할 수 없다.
	//  1)상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 2)상수 선언
	static final double EARTH_SURFACE_AREA;
	
	// static 맴버필드가 메모리 생성 후, 아래 static블럭이 자동으로 호출 됨.
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
		
	}
}
