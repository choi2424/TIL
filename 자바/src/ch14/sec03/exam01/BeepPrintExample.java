package ch14.sec03.exam01;

//	스레드 : 프로그램에서 독립적으로 실핼하는 단위. 
//	하나의 프로그램은 기본적으로 하나의 스레드를 제공.
//	기본 스레드 이름 : main스레드

//	프로그램이 실행을 할때에 JVM이 main스레드를 동작시키고 main스레드가 담당하는 main()메서드를 실행히신다

//	기본스레드(main스레드) 하에서 main메서드의 실행순서는 작성된코드 . 즉위에서 아래로 순차적으로 실행되는 특징
import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
//		작업 1 : 소리 효과음 발생
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
//		작업 2 : "띵" 문자열 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
