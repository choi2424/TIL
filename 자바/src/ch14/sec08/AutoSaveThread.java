package ch14.sec08;

public class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			save();
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
		}
		
		
	}
}
