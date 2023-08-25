package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		/*
		 정수 , 실수 데이터타입 형변환(casting)예
		 
		 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면
		 int 타입보다 작은 byte, short 타입변수는 int 타입으로 자동 변환되어 연산 수행
		 */
		byte result1 = 10 + 20;
		System.out.println("result1 : " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
//		byte result2 = v1 + v2; 에러발생
		int result2 = v1 + v2; // int 타입으로 변환 후 연산
		System.out.println("result2 : " + result2);

//		다른 데이터타입끼리 연산시 가장 큰데이터타입으로 형변환이 발생된다.
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result3 = v3 + v4 + v5;
		System.out.println("result3 : " + result3); // long타입으로 변환 후 연산
		
		char v6 = 'A';
		char v7 = 1; // 유니코드값 1
		int result4 = v6 + v7; // int 타입으로 변환 후 연산
		System.out.println("result4 : " + result4);
		System.out.println("result4 : " + (char)result4);
		
//		정수연산의 결과가 정수다
		int v8 = 10;
		int result5 = v8 / 4 ;
		System.out.println("result5 : " + result5);
		
//		실수와정수 연산의 결과는 실수다.
		int v9 = 10;
		double result6 = v9 / 4.0; // 4.0은 double 실수 데이터타입 .. int-> double 변환
		System.out.println("result6 : " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10 / v11;
		System.out.println("result7 : " + result7);
		
	}

}
