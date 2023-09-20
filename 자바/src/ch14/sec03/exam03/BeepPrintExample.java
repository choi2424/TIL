package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
//					0.5초 일시정지하는 기능
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
//		작업 2 : "띵" 문자열 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
//			0.5초 일시정지하는 기능
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
	}

}
