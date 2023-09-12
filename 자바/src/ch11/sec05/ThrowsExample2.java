package ch11.sec05;

//	예외떠넘기기(예외전가)
public class ThrowsExample2 {

//	JVM에 예외를 떠 넘긴다
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
		System.out.println("test");
	}

//	예외전가 : throws ClassNotFoundException
//	이 메서드를 호출한 쪽으로 예외 떠넘기기 작업.
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
