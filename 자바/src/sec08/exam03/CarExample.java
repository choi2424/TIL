package sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
//		myCar 객체생성
		Car myCar = new Car();
		
//		setGas(5)
		myCar.setGas(5);
		
//		if isLeftGas : gas가 존재하면 "출발합니다" 메세지를 출력하고 , run()메소드호출
		if (myCar.isLeftGas() == true) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		
//		"gas를 주입하세요" 출력
		System.out.println("gas를 주입하세요");
	}

}
