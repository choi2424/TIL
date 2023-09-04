package sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
//		myCalcu 객체생성
		Calculator myCalcu = new Calculator();
		
//		result1 : 정사각형의 넓이 구하기 . 10
		double result1 = myCalcu.areaRectangle(10.0);
		
//		result2 : 직사각형의 넓이 구하기 10, 20
		double result2 = myCalcu.areaRectangle(10.0, 20.0);
		
		System.out.println("정사각형의 넓이 = " + result1);
		System.out.println("직사각형의 넓이 = " + result2);
	}

}
