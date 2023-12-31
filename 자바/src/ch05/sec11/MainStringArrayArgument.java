package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
//		JVM 구동되면서, 자바프로그램의 main() 시작메서드를 호출한다.
//		String[] args 사용법
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 프로그램 종료기능
		}
		
//		main()메서드의 매개변수를 2개 제공하여 실행했을경우
		String strNum1 = args[0];
		String strNum2 = args[1];
		
//		문자열을 정수형으로 변환, 예) "10" -> 10변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d",num1,num2,result);
		
		

	}

}
