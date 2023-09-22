package ch14.sec07.exam01;

// 스레드로 사용할 클래스
public class PrintThread extends Thread {

	private boolean stop; // 기본값 false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		// 작업내용
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
	
	
}
