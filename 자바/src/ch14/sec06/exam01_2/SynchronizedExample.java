package ch14.sec06.exam01_2;

public class SynchronizedExample {

	public static void main(String[] args) {
//		user1Thread 스레드는 기억장소를  calculator1를 사용
//		user2Thread 스레드는 기억장소를  calculator2를 사용
		
		Calculator calculator1 = new Calculator(); // 100번지
		Calculator calculator2 = new Calculator(); // 200번지
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator1); // 100번전달
		user1Thread.start(); // run()메서드 호출(100 변경)
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator2); // 200번전달
		user2Thread.start(); // run()메서드 호출(50 변경)
		
		
	}

}
