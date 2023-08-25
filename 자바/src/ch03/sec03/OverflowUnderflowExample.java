package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
//		Overflow : 데이터타입이 허용하는 최대값을 초과시
//		Underflow : 데이터타입이 허용하는 최소값을 초과시
		
//		byte var1 = 128; 에러발생
		byte var1 = 125; // -128 ~ 127 허용값
		for (int i = 0;  i<5; i++) {
			var1++; // 126 , 127 , -128 , -127 , -126 
			System.out.println("var1 : " + var1);
		}
		
		System.out.println("--------------------");
		
		byte var2 = -125; // -128 ~ 127 허용값
		for (int i = 0;  i<5; i++) {
			var2--; // -126 , -127 , -128 , 127 , 126
			System.out.println("var2 : " + var2);
		}
		
		
	}

}
