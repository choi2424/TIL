package sec09;

public class CarExample {

	public static void main(String[] args) {
//		new : 메모리 생성연산자 , Car클래스의 인스턴스 멤버를 가지고, 힙영영에 메모리를 생성한다
//											정적(static)멤버는 제외한다.
		Car myCar = new Car("포르쉐");
//		정적멤버를 myCar객체로 접근하여 사용은 가능하지만, 권장은 안한다.
		myCar.Color = "노랑";// c#언어는 자바의 단점을 분법적으로 허용하지 않는다.
		
		
		Car yourCar = new Car("벤츠");
		
		
		myCar.run();
		yourCar.run();
	}

}
