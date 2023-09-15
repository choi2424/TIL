package ch13.sec01.exam02;

public class GenericExample {

	public static void main(String[] args) {
		HomeAgensy homeAgensy = new HomeAgensy();
		Home home = homeAgensy.rent();
		home.turnOnLight();
		
		CarAgensy carAgensy = new CarAgensy();
		Car car = carAgensy.rent();
		car.run();
	
		
	}

}
