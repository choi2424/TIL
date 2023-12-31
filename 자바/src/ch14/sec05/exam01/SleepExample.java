package ch14.sec05.exam01;

import java.awt.Toolkit;

//	스레드 상태 : 일시정지

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(3000); // 실행상태가 3초간 일시정지. 3초후에는 대기상태(runnable)로 전환된다
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
	}

}
