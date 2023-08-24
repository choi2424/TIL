package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		
//		자동형변환(묵시적)
//		큰 데이터타입 = 작은 데이터타입;
//		byte < short, char < int < long < float < double
		
		byte byteValue = 10;
		// 자동형변환. 1바이트인 byteValue의 변수값을 읽어와서  4바이트로 변환 되고 그 값이 intValue에 대입된다
		int intValue = byteValue; // = 대입연산자를 기준으로 왼쪽의 타입에 오른쪽이 타입일치가 발생 
		
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+ doubleValue);
				
				
	}

}
