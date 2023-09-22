package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료.");
	}

}
