package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
//		�迭�� �����ϱ����� ���� for��
		
		int[] scores = { 95 , 71 , 84 , 93 , 87 };
		
//		�迭��
		int sum = 0;
		
//		1)
		/*
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		*/
		
//		2) ���� for�� for(���� : �迭)
		for (int score : scores) {
			sum += score;
		}
		System.out.println("���� ���� = " + sum);
//		�迭 �׸� ��ü ��� ���ϱ�
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
	}

}
