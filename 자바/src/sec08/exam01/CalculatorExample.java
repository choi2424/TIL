package sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
//		myCalc
		Calculator myCalc = new Calculator();
		
//		 계산기 전원 on
		myCalc.powerOn();
		
//		5 + 6 해보기
		int result1 = myCalc.plus(5, 6); 
		System.out.printf("result1 : %d\n",result1);
		
		int x = 10;
		int y = 4;
		
//		result2로 결과값을 받아 , 출력
		double result2 = myCalc.divide(x, y);
		System.out.printf("result2 : %f\n",result2);
		
//		result3 출력 , minus()호출
		int result3 = myCalc.minus(10, 4);
		System.out.printf("result3 : %d\n",result3);
		
//		result4 출력 . 5,10
		int result4 = myCalc.multiply(5, 10);
		System.out.printf("result4 : %d\n",result4);
		
//		 계산기 전원 off
		myCalc.powerOff();
		
	}

}
