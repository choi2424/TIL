package ch13.sec01.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv,String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind(); 
		String tvModel = product1.getModel();
		
//		product2 객체 <Car , String>
//		모델 : SUV자동차
		Product<Car, String> product2 = new Product<Car, String>();
		
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
//		product3 객체 <Aircon , String>
//		모델 : AirCon
		
		Product<Eeokeon,String> product3 = new Product<Eeokeon, String>();
		
		product3.setKind(new Eeokeon());
		product3.setModel("Eeokeon");
		
		Eeokeon eeokeon = product3.getKind();
		String eeokModel = product3.getModel();
	
//		제네릭을 사용하지 않으면 , 타입이 Object클래스로 관리
		Product product = new Product();
	}

}
