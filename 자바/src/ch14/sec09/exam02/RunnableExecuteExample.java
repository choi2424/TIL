package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		
		// 작업 준비 내용
		String[][] mails = new String[1000][3];
		
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "user" + i + "@my.com";
			mails[i][2] = "신상품입고";
		}
		
		// 1) 스레드풀 생성 스레드 초기갯수 5개.
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 2) 작업 생성 및 처리 요청(스레드 풀의 작업 규(Que)에 등록)
		for(int i=0; i<1000; i++) {
			final int idx = i; // jdk 1.8에서 부터는 final 생략가능.
			// 지역변수가 익명객체 안에서 사용시 값을 변경이 불가능하게 만들어주는 문법규칙이 존재한다.
			executorService.execute(new Runnable() { // 익명구현객체
				// 리턴값이 없는경우 사용한다.
				
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					// run()메소드의 내용을 실행하는 스레드풀의 스레드를 참조.
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "]" + from + " ==> " + to + " : " + content);
				}
			});
		}
		
		// 3) 스레드 풀 종료
		executorService.shutdown();
		
	}

}
