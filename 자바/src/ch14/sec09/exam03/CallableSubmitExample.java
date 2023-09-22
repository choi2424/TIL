package ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {

	public static void main(String[] args) {
		
		// 1. 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 2. 계산작업 생성 및 처리요청(작업큐에 등록) = 작업 100개
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					// 1~100 범위의 누적된 합을 구하는 목적.
					int sum = 0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					
					Thread thread = Thread.currentThread();
					System.out.println("["+ thread.getName() + "] 1~" + idx + "합 계산");
					return sum;
				}
			
			});
			
			try {
				int result = future.get(); // 블로킹(Block)
				System.out.println("\t 리턴값 : " + result);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 3) 스레드 풀 종료
		executorService.shutdown();
		
	}
}
