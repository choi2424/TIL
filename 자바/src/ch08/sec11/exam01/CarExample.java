package ch08.sec11.exam01;


//	필드 다형성
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 차를 생성
		
		myCar.tire = new HankookTire(); // 바퀴장착 형변환 다형성
		myCar.run();
//		타이어 변경사항
		
		myCar.tire = new KumhoTire(); // 바퀴장착 형변환 다형성
		myCar.run();
		
	}

}
