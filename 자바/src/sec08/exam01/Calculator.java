package sec08.exam01;

// 객체 : 계산기
public class Calculator {
	
//	리턴값이 없는 메서드 : void
	void powerOn() {
		System.out.println("전원을 킵니다."); // powerOn()메서드를 호출(실행)하고, 호출한 쪽으로 제어가 넘어간다
	}
	
//	리턴값이 없는 메서드
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
//	두 정수를 입력받아 더하는 기능
	int plus(int x, int y) {
		int result = x + y;
		return result; // plus()메서드를 호출한 코드로 값을 갖고 제어가 넘어간다.
	}
//	두 정수를 입력받아 빼는 기능
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int multiply(int x , int y) {
		int result = x * y;
		return result;
	}
	
//	두 정수의 값을 입력받아 나누는 기능
	double divide(int x , int y) {
		double result = (double)x / y ;
		return result;
	}
	
	
}
