package ch13.sec01.exam02;

public class CarAgensy implements Rentable<Car>{
	
	@Override
	public Car rent() {
		
		return new Car();
	}
	
	
}
