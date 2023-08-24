package ch02.sec02;

public class IntExample {

	public static void main(String[] args) {
//		int형 데이터 타입 : 크기 4byte. 저장값 -2147483638~2147483647
		int var1 = 0b1011; // 2진수 표현법 앞에 0b를 넣는다.
		int var2 = 0206; // 8진수 표현법 앞에 0을 넣는다.
		int var3 = 365;
		int var4 = 0xB3; // 16진수 앞에 0x를 넣는다
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

	}

}
