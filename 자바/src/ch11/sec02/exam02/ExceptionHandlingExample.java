package ch11.sec02.exam02;

//	예외처리를 하게되는 경우
/*
 1)실행시 발생되는 오류(예외)를 비정상적인 종료를 막고자 한다
 2)JDK 명령어인 메서드중 예외처리를 하도록 만든 것이 존재하여, 예외처리를 해야 한다.
 */
public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2"); // 예외발생 . java.lang 패키지에 String2클래스가 존재안함
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
