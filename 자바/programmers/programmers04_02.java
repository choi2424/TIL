package programmers;

public class programmers04_02 {

	public static void main(String[] args) {
//		정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
/*
		number	n	m	result
		60		2	3	1
		55		10	5	0
*/		
		int number = 60;
		int n = 2;
		int m = 3;
		
		int answer = (number % n == 0 && number % m == 0) ? 1 : 0;  
		System.out.println(answer);
	}

}
