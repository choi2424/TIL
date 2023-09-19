package ch16.sec01.test;

public class CalculatorExample {
	
	public static void main(String[] args) {
		
		
		
		action((x ,y) -> {
			int result = x + y;
			System.out.println("result : " + result);
		});
	}

	private static void action(Calculator calculater) {
		
		calculater.add(10, 20);
	}
}
