package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		// 1. 스레드 풀 생성. 5개의 스레드를 생성해 관리하겠다 라고 선언하는 형태.
		// 스레드 풀에서 스레드가 사용되지 않더라도, 스레드 풀에서 제거하지 않는다.
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 스레드 풀의 Que구조를 가지고 있는 장소에 작업이 추가 될 때마다 스레드가 부족하면, 스레드를 추가 생성하여 작업을 한다.
		// 단. 스레드 풀의 스레드가60초 동안 작업을 하지 않으면, 스레드 풀에서 제거시킨다.
//		ExecutorService executorService = Executors.newFixedThreadPool();
		
		// 2. 작업 생성 : 작업 클래스 
		
		// 3. 처리 요청 : 작업 생성된 객체를 스레드 풀의 Que(큐)에 등록하는 작업.
		
		// 4. 스레트 풀 종료.
		executorService.shutdown(); // 셧다운. 종료. 스레드 풀 작업을 모두 종료하면 종료한다.
		
		//executorService.shutdownNow(); // 셧다운 나우. 즉시종료. 스레드 풀의 큐의 작업을 무시하고 바로 종료한다.
		// 저장하지 않은 현재 작업은 유실되며, 큐에 등록된 진행하지 않은 작업은 나중에 리턴 받을 수 있다.
	}

}
