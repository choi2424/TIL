package ch14.sec06.exam02;

// Thread 클레스에서 사용할 작업내용을 가지고 있는 클래스.
public class WorkObject {

	// 생산자 기능 : 마트 진열대에 우유를 공급
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		// 현재 실행하고 있는 스레드를 참조.
		System.out.println(thread.getName() + " : " + "methodA() 작업 실행");
		
		notify(); // wait()로 일시정지  상태에 있는 스레드를 개기(runnable)상태로 변경한다.
		
		try { Thread.sleep(500); wait(); } catch (InterruptedException e) {}
		// wait()는 현재 실행 스레드를 일시정지 상태로 변경한다.
	}
	
	// 소비자 기능 : 마트의 진열대에서 우유를 소비
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		// 현재 실행하고 있는 스레드를 참조.
		System.out.println(thread.getName() + " : " + "methodB() 작업 실행");
		
		notify(); // wait()로 일시정지  상태에 있는 스레드를 개기(runnable)상태로 변경한다.
		
		try { Thread.sleep(500); wait(); } catch (InterruptedException e) {}
		// wait()는 현재 실행 스레드를 일시정지 상태로 변경한다.
	}
	
}
