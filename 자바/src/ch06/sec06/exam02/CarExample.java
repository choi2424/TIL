package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
//		객체생성
		Car myCar = new Car();
		
//		필드값 읽어오기
		System.out.printf("제작회사 : %s\n",myCar.company);
		System.out.printf("모델명 : %s\n",myCar.model);
		System.out.printf("색깔 : %s\n",myCar.color);
		System.out.printf("최고속도 : %d\n",myCar.maxSpeed);
		System.out.printf("현재속도 : %d\n",myCar.speed);
		
//		필드값 변경하기
		myCar.speed = 60;
		System.out.printf("수정된 속도 : %d\n",myCar.speed);
	}

}
