package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicla = new Bus();
		
		vehicla.run(); // 인터페이스 변수를 통하여 호출
//		vehicla.checkFara(); 호출안됨.
		
		Bus bus = (Bus)vehicla;
		bus.run();
		bus.checkFare();
	}

}
