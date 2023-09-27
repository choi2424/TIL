package programmers;

import java.util.Random;

public class programmers04_05 {

	public static void main(String[] args) {
		/*
		 * flag에 따라 다른 값 반환하기 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a +
		 * b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요. 
		 */
		Random random = new Random();
		
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		boolean flag = random.nextBoolean();
		
		int answer = (flag) ? a + b : a - b;
		
		System.out.println(answer);
		
	}

}
