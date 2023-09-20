package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start(); // 스레드상태 : runnable(대기) -> CPU의 스케쥴링에 의하여 , CPU점유를 받아 실행.
		
		try {
			// main스레드가 일시정지상태가 된다. sumThread가 동작이 완료되면 , main스레드는 대기상태로간다
			sumThread.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100합 : " + sumThread.getSum());
	}

}
