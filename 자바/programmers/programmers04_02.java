package programmers;

public class programmers04_02 {

	public static void main(String[] args) {
//		���� number�� n, m�� �־����ϴ�. number�� n�� ����̸鼭 m�� ����̸� 1�� �ƴ϶�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
