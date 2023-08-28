package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
//		비교연산자는 true,false 값을 생성한다.
//		1)점수데이터
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1); // 같다
		System.out.println("result2 : " + result2); // 같지않다.
		System.out.println("result3 : " + result3); // 작거나같다
		
//		2) 문자데이터
		char char1 = 'A'; // 아스키코드값 65
		char char2 = 'B'; // 아스키코드값 66
		boolean result4 = (char1 < char2); // 65 < 66
		
//		3) 정수,실수 혼합 비교연산 . 연산시 가장 큰 데이터타입으로 형변환되는 규칙(중요)
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); // int == double -> (double) int == double
		System.out.println("result5 : " + result5); // true 
		
//		4)실수 데이터. 정밀도(유효자리수).
		float num5 = 0.1f; // 0.2323122 -> double 0.232312200000000
		double num6 = 0.1; // 0.232312223242323
		boolean result6 = (num5 == num6); // float == double -> (double) float == double
		boolean result7 = (num5 == (float)num6); 
		System.out.println("result6 : " + result6); // false 
		System.out.println("result7 : " + result7); // true
		
//		5)문자열 데이터
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // str1 == str2 비교시 사용하면 안됨.(중요)
		boolean result9 = (!str1.equals(str2)); 
		System.out.println("result8 : " + result8); // false
		System.out.println("result9 : " + result9); // true
		
				

	}

}
