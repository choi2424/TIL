package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {

//		Car 객체생성
		Car myCar = new Car();
//		Car myCar = null; 참조연산자로 인한 작업은 에러발생 NPE
		
//		Car 클래스로 만들어진 객체가 생성된 힙영역의 기억장소를 접근
//		필드값 읽기
//		. : 참조연산자
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		
		
	}

}
