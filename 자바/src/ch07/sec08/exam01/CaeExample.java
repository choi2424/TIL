package ch07.sec08.exam01;

//	자동차 회사 조립과정
public class CaeExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 차를 생성
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire(); // 바퀴장착
		myCar.run();
//		타이어 변경사항
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
	}

}
