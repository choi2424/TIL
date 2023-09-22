package ch14.sec08.exam02;

import ch14.sec06.exam02.ThreadA;

// 우선순위가 높아도 전반적으로 점유를 할당을 받는 비율이 보다 많을 뿐이지 절대적인 형태는 아니다.
// 우선순위를 높게 설정한다고 해서 항상 먼저 실행되는 것을 보장하는 것은 아니다.
public class TaskThreadMain {

	public static void main(String[] args) {

		Task1 task1 = new Task1(); // 101~199
		task1.setPriority(10);
		task1.start();
		
		Task2 task2 = new Task2(); // 201~299
		Thread threadTask2 = new Thread(task2);
//		threadTask2.setPriority(1);
		threadTask2.start();
		
		System.out.println("작업3 시작");
		for(int i=301; i<399; i++) { //301~399
			System.out.print(i + " ");
		}
		System.out.println("작업3 종료");
		
	}

}
