package ch08.sec11.exam02;

//	운송수단을 선택하여 , 실제 사용하는 클래스
public class Driver {
	public void drive(Vehicle vehicle) {
//		vehicle에 제공되는 객체가 bus , taxi 에 따라서 자식객체의 재정의된 메서드가 호출이됨
		vehicle.run();
	}
}
