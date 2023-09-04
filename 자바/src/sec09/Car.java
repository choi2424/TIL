package sec09;

// 클래스를 정의 할때 , 인스턴스 멤버에 대하여 알아보자.
// 클래스의 구성요소인 멤버는 2가지로 구성된다. 메모리 생성과 관련이 있다.(중요)
// 1)인스턴스 멤버 2)정적(static)멤버
// 코드로 작성하면 멤버에 static 키워드를 사용 안 한 경우를 인스턴스 멤버 라고한다.
// 멤버에 static 키워드를 사용 한 경우를 정적(static) 멤버 라고한다.
public class Car {
	
//	필드선언
	String model;
	int speed;
	
//	main()메서드가 실행이 되면 main()메서드 안에 사용된 클래스를 먼저찾고 그 클래스안에
//	정적(static)멤버가 존재하면, 메서드 영역이라는 곳에 기억장소를 생성한다.
//	 new는 정적(static)멤버는 힙영역의 메모리생성에서 제외한다. 
	static String Color;
//	기본생성자
//	Car() {};
	
//	생성자선언
	Car(String model){
		this.model = model; // 매개변수에 this는 사용불가
	}
	
//	메서드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.printf("%s가 달립니다.(시속 : %d km/h)\n",this.model,this.speed);
	}
	
	
	
}
