package ch14.sec07.exam02_2;

public class InterruptExample {

	public static void main(String[] args) {

//		PrintThread printThread = new PrintThread();
		Thread thread = new PrintThread();
		// 부모클래스명 변수명 = new 자식클래스명 형태로 만들자.
		
		thread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		thread.interrupt(); 
		// thread 객체가 관리하는 스레드에서 sleep() 메소드에 의한 일시정지 상태 일 경우,
		// 예외 코드가 발생되어 코드가 while문 아래로 진행된다.
		
	}

}
