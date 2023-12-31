package ch14.sec06.exam02;

// 스레드 클래스 : 작업 내용을 독립적인 형태로 관리하는 목적.
// 
/*
 * 1. Thread 클래스를 상속 : run() 메소드 재정의.
 * 2. Runnable 인터페이스 구현 : run() 메소드 재정의.(구현)
 */
public class ThreadB extends Thread {

	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("ThreadB " + (i+1) + "번째 실행");
			workObject.methodB(); // 실질적인 작업내용.
		}
	}
	
	
}
