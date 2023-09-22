package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		// 1. 작업내용을 가지고 있는 객체 생성
		WorkObject workObject = new WorkObject();
		
		// 2. 작업내용을 관리하는 스레드 객체 생성.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start(); // 내용 ThreadA : methodA() 작업 실행
		threadB.start(); // 내용 ThreadB : methodA() 작업 실행
		
	}
}
