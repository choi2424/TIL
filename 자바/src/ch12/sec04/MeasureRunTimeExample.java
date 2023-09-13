package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime(); // 1970년 1월 1일
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합" + sum);
		System.out.println("계산에0.00" + ((time2 - time1)/10000) + "초가 소요됨");
		
		
	}

}
