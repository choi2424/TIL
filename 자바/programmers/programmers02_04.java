package programmers;

public class programmers02_04 {

	public static void main(String[] args) {
//		자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
		
		int n = 100;
		
		if (n % 2 == 0) {
			System.out.printf("%d is even",n);
		}else {
			System.out.printf("%d is odd",n);
		}
	}

}
