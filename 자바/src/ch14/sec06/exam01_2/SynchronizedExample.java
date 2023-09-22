package ch14.sec06.exam01_2;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// user1Thread 스레드는 기억장소를 calculator1을 사용.
		// user2Thread 스레드는 기억장소를 calculator2을 사용.
		
		
		// 스레드 2개 (user1Thread, user2Thread)가 calculator객체를 공유하고 있다.
		Calculator calculator1 = new Calculator(); // 공유객체
		Calculator calculator2 = new Calculator(); // 공유객체
		
		// 주소 : 100번지
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator1);
		user1Thread.start(); // run() 메소드 호출(값을 100으로 변경)
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator2);
		user2Thread.start(); // run() 메소드 호출(값을 50으로 변경)
		
		
		
	}

}
