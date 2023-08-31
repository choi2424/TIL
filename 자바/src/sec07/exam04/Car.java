package sec07.exam04;

// 생성자 오버로딩(overloading) : 생성자를 여러개 정의하는 의미
public class Car {
	
//	필드선언
	String company = "현대자동차";
	String model = "그렌져";
	String color = "흰색";
	int maxSpeed = 200;
	
//	생성자 선언
	
	Car() {} // 디폴트 생성자는 다른 생성자선언 때문에 자동으로 생성되지 않으므로 , 수동으로 선언함.
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model , String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color , int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
