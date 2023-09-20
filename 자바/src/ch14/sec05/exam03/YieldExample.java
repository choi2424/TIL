package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = false; // workThreadA는 대기상태가되고 , 다른스레드에게 양보. 
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = true;
		
	}

}
