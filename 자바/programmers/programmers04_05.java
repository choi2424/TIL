package programmers;

import java.util.Random;

public class programmers04_05 {

	public static void main(String[] args) {
		/*
		 * flag�� ���� �ٸ� �� ��ȯ�ϱ� �� ���� a, b�� boolean ���� flag�� �Ű������� �־��� ��, flag�� true�� a +
		 * b�� false�� a - b�� return �ϴ� solution �Լ��� �ۼ��� �ּ���. 
		 */
		Random random = new Random();
		
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		boolean flag = random.nextBoolean();
		
		int answer = (flag) ? a + b : a - b;
		
		System.out.println(answer);
		
	}

}
