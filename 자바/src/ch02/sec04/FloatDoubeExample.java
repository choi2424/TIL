package ch02.sec04;

public class FloatDoubeExample {

	public static void main(String[] args) {
/*
  		실수 데이터타입
  		float  : 4byte
  		double : 8byte
  		
  		정수데이터타입보다는 실수 데이터타입의 값이 범위를 확장하기 위해서
  		부동(floating)소수점 방식이라는 형태로 실수값을 관리한다.
  		부동소수점방식으로 인한 실수값이 오차가 존재한다
  		대표적인 경우가 0.1 + 0.2 != 0.3
  		0.1 + 0.2 = 0.30000000000000004
  		0.1이 부동소수점 방식으로 저장되기 때문에 온전히 0.1로 저장되지 않아 오차가 생김.
  		대안으로 각 언어마다 맞는 라이브러리를 사용 
  		부호비트 + 지수비트 + 가수비트로 저장방식을 사용함.
*/
		
		float var1 = 0.1234567890123456789f;
		// 더블형 데이터타입은 마지막에 d를 안넣어도된다 디폴트가 d
		double var2 = 0.123456789123456789d; 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		double var3 = 3e6; // 3*10^6
		float var4 = 3e6f; // 3*10^6
		double var5 = 2e-3; // 2*-10^3
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
