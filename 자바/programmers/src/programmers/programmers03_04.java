package programmers;

public class programmers03_04 {

	public static void main(String[] args) {
/*
		���� ++�� �� ������ ���� �������� �� ������ �ٿ��� �� ���� ��ȯ�մϴ�. ���� ��� ������ �����ϴ�.

		12 ++ 3 = 123
		3 ++ 12 = 312
		���� ���� a�� b�� �־����� ��,
		a ++ b�� b ++ a �� �� ū ���� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

		��, a ++ b�� b ++ a�� ���ٸ� a ++ b�� return �մϴ�.
*/
		int a = 9;
		int b = 91;
		int answer = 0;
		
		if(Integer.parseInt((String.valueOf(a)+b)) >= Integer.parseInt((String.valueOf(b)+a))) {
			answer += Integer.parseInt((String.valueOf(a)+b));
		}else {
			answer += Integer.parseInt((String.valueOf(b)+a));
		}
		System.out.println(answer);
		/* ���ڸ� ���ڷ� ��ȯ�Ҷ� �׳� "" �տ� �ٿ����� ��µ� 
		 * �´� Ʋ���� �������� �ΰ��� if���� 3�� �����ڸ� ��߰ڴ�
		int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;
        */
	}

}
