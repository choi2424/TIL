package programmers;

import java.util.Random;

public class programmers04_03 {

	public static void main(String[] args) {
//		Ȧ¦�� ���� �ٸ� �� ��ȯ�ϱ�
//		���� ���� n�� �Ű������� �־��� ��, n�� Ȧ����� n ������ Ȧ���� ��� ���� ������ ���� return �ϰ� 
//		n�� ¦����� n ������ ¦���� ��� ���� ������ ������ ���� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
//		����� ��
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
