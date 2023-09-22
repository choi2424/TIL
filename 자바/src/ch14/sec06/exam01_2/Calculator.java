package ch14.sec06.exam01_2;

// 공유 자원이 있는 클래스 용도.
public class Calculator {

	private int memory; 
	// 공유필드 : 
	// user1Thread 스레드가 100 저장.
	// -> User2Thread 스레드가 50으로 변경 저장.
	
	public int getMemory() {
		return memory;
	}
	
	// 공유자원을 접근하는 메소드에 동기화 작업을 해야한다.
	// 기억장소를 각각 나눠 사용했기에, synchronized가 필요가 없다.
	public void setMemory1(int memory) {
		this.memory = memory;
		System.out.println("2초간 일시정지.");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	

}
