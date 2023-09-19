package ch16.sec04;

public class LamdbaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
//		실행문이 2개 이상 일 경우
		person.action((x , y) -> {
			double result = x + y;
			return result;
		});
		
//		리턴문이 하나 있을경우
		person.action((x,y) -> sum(x, y));
	}
	
	
	public static double sum(double x , double y) {
		return ( x + y );
	}

}
