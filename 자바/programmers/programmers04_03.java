package programmers;

import java.util.Random;

public class programmers04_03 {

	public static void main(String[] args) {
//		홀짝에 따라 다른 값 반환하기
//		양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
//		n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
//		입출력 예
//		n	result
//		7	16
//		10	220
		Random random = new Random();
		int n = random.nextInt(10);
		
		int a = 0;
		if( n % 2 == 0 ) {
			for(int i = 0; i <= n; i += 2) {
				a += i*i;
			}
		}else {
			for (int i = 1; i <= n; i += 2) {
				a += i;
			}
		}
		System.out.println(a);
	}

}
