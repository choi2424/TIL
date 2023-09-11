package ch08.sec11.exam02;

public class DriverExample {

//	매개변수 다형성
	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		버스 선택
		Bus bus = new Bus();
		driver.drive(bus);
		
//		택시선택
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
//		자전거선택
		Bycle bycle = new Bycle();
		driver.drive(bycle);
	}

}
