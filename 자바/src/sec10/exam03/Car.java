package sec10.exam03;

public class Car {
	
//	? 인스턴트필드
	int speed;
	
//	? 인스턴트 메서드 . 인스턴스 메서드에서는 인스턴스 필드,메서드는 사용가능
	void run() {
		System.out.println(speed + "으로 달립니다.");
		
	}
	
	void stop() {
		run() ;
	}
	
//	? 정적메서드 . 정적메서드에서는 인스턴스 필스 , 메서드를 사용 불가능 
	static void simulate() {
//		이객체 생성은 지역레벨이므로, 해당 메서드가 실행이 끝나면 , 메모리는 자동 소멸된다.
		Car myCar = new Car();
		
		myCar.speed = 200;
		myCar.run();
		myCar.stop();
		
//		stop(); //인스턴스 메서드가호출시 객체생성작업이 안되어 있으면 힙 영역 메모리 상에 stop() 메서드의 정보가 없어서 호출 에러가 발생
//		왜 호출이 불가능 할까. 메인메서드에서 40라인에서 객체생성작업을 하지 않으면 speed(), run() , stop()
//		멤버필드의 정보가 힙영역에서 생성되지 않으므로 , 접근시 문제가 된다
		
//		이유는 정적 메서드는 클래스가 로딩시에 메모리가 할당되지만 인스턴스 메서드는 객체가 생성될때 메모리가 할당되므로
//		정적메서드가 메모리가 할당될때 인스턴트메서드는 메모리가없다 이 이유로
//		정적메서드에서 인스턴스 메서드가 호출이 불가능 하다
	}
	
//	시작(실행) 클래스 : main()메서드는 작성되는 위치가 어떤 클래스든 상관이 없다.
//	Car클래스의 구성요소인 메서드가 아니다. 그리고 JVM에 의하여 관리가 이루어진다.
	public static void main(String[] args) {
		simulate(); // Car.simulate(); 클래스이름.메소드명에서 클래스이름 생략가능
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
		
		
	}
}
