package sec10.exam01;

public class Calculator {
	
//	main()메서드가 시작될때 메서드 영역에서 정적(static)멤버의 기억장소가 생성이 된다.
//	단 한번만 메서드 영역에 기억장소가 생성.
//	공유목적으로 생성
	
	static double pi = 3.14159265385;
	
	static int plus(int x , int y) {
		return x + y;
	}
	
	static int minus(int x , int y) {
		return x - y;
	}
	
}
