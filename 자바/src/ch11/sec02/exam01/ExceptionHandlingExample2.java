package ch11.sec02.exam01;


//	8 라인에 예외발생되어 예외처리를 
public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try{
		int result = data.length(); // 참조연산자는 주소값을 가지고 있을 때 사용
		System.out.println("문자수 : " + result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("[마무리 실행]");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava"); // 예외발생이 없는 경우
		printLength(null); // 예외발생 -> 비정상적인 종료.
		System.out.println("[프로그램 종료]"); // 이라인은 위에서 예외발생이되어 정상적으로 실행하지 못한다
		
	}
}
