package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

// 다른 패키지의 동일한 이름의 클래스를 사용시, 풀네임 형식으로 코딩하라.
// 패키지명.클래스이름
// import 코드 사용하지 말 것.

public class Car {
	
	// import를 사용하지 않고 패키지명을 전부 입력하는 형식.
	ch06.sec12.hankook.Tire tire_h = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire_k = new ch06.sec12.kumho.Tire();
	
	SnowTire snowTire_h = new SnowTire();
	AllSeasonTire allSeasonTire_k = new AllSeasonTire();
}
