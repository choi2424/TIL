package programmers;

public class programmers04_04 {

	public static void main(String[] args) {
		/*
		 * ���ǹ��ڿ� ���ڿ��� ���� ������ ���� �� ���� ũ�⸦ ���Ϸ��� �մϴ�.
		 * 
		 * �� ���� n�� m�̶�� ">", "=" : n >= m "<", "=" : n <= m ">", "!" : n > m "<", "!" :
		 * n < m �� ���ڿ� ineq�� eq�� �־����ϴ�. ineq�� "<"�� ">"�� �ϳ���, eq�� "="�� "!"�� �ϳ��Դϴ�. �׸��� ��
		 * ���� n�� m�� �־��� ��, n�� m�� ineq�� eq�� ���ǿ� ������ 1�� �ƴϸ� 0�� return�ϵ��� solution �Լ���
		 * �ϼ����ּ���.
		 * 
		 * ����� �� ineq eq n m result "<" "=" 20 50 1 ">" "!" 41 78 0
		 */
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 40;
		String a = ineq + eq;
		int answer = 0;

		if (a.equals("<=")) {
			if (n <= m) {
				answer += 1;
			}
		}

		if (a.equals(">=")) {
			if (n >= m) {
				answer += 1;
			}
		}

		if (a.equals(">!")) {
			if (n > m) {
				answer += 1;
			}
		}

		if (a.equals("<!")) {
			if (n < m) {
				answer += 1;
			}
		}

		System.out.println(answer);
	}

}
