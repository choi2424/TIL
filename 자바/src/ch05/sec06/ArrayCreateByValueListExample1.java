package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		/*
		�迭 - ������ ������Ÿ���� ���� �����ϱ� ���� �������� ������ ������(�ڷᱸ��)
		
		������Ÿ��[] ���� = new ������Ÿ��[����]
		
		������Ÿ�� : 1)�⺻������Ÿ�� 2)����Ÿ��
		
		�迭�� ����Ÿ���̴�.
		*/
		
//		1)�⺻������Ÿ���� �̿��� �迭
		int[] scores = {83 , 90 , 87}; // �������� ������ �������� ���� int������ �Ѵ�.
		
//		���հ� ��� ���ϱ�
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����  : " + sum);
		System.out.println("���  : " + ((double)sum / scores.length));
		
//		2)����Ÿ���� �̿��� �迭
		
		String[] season = { "Spring" , "Summer" , "Fall" , "Winter" };
		
//		�迭�� �׸� �б�
		for (int i = 0; i < season.length; i++) {
			
			System.out.printf("season[%d] : %s\n" , i,season[i]); // �������� ������ �������� ����� �ּҸ����Ͽ� �����͸� �б�
		}
//		�ε��� 1������ �����͸� ����
		season[1] = "����";
		System.out.println(season[1]);
				
	}

}
