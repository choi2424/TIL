package ch03.sec01;

public class IncDecOperatorExample {

	public static void main(String[] args) {
//		증감 연산자 : ++ , --
		int x = 10;
		int y = 10;
		int z ;
		
//		구문이 단독으로 사용되면, 증감연산자의 위치에 상관없이 변수에 +1 해서 저장한다
		x++; // 후위형 증가연산자
		++x; // 전위형 증가연산다

		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
//		구문이 단독으로 사용되면, 증감연산자의 위치에 상관없이 변수에 -1 해서 저장한다
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-----------------------");
		
//		아래 구문을 주석을 번갈아 가며, 값을 확인한다
		z = ++x; // x의 변수에 1을 더하여 저장한후 값을 읽어와서 z변수에 값을 대입한다. 
//		z = x++; // x의 변수값을 먼저 읽어와서 z변수에 값을 대입한다 . 그리고 x에 1을 더하여 저장한다.
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
		z = ++x + y++ ;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
