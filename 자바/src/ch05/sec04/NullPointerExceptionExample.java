package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
//		Null 에러
		int[] intArray = null;
//		intArray 변수에는 힙영역에 생성된 주소가 없기 때문에, 값을 대입할 수가 없다
//		intArray[0] = 10; // NullPointerException 에러가 발생됨. NPE에러라고 자주함
		
		String str = null; // string타입은 클래스 참조타입이다
//		System.out.println("총 문자수 :" + str.length()); // NullPointerException 에러가 발생 
		

	}

}
