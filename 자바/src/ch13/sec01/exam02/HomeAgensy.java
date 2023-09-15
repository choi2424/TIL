package ch13.sec01.exam02;

public class HomeAgensy implements Rentable<Home>{
	
	@Override
	public Home rent() {
		
		return new Home();
	}
}
