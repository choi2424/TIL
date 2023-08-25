package ch03.sec01;

public class SignOperaterExample {

	public static void main(String[] args) {
//		부호 연산자 : + , -
		int x = -100;
		x = -x;
		System.out.println("x : " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y : " + y);

	}

}
