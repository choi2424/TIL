package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
//		�Ǽ�������Ÿ���� �ε��Ҽ��� ������� ���� ���� �����߻� ����
//		���� ? ���1���� 0.1������ 10�������� ����, �� �� 7����(0.7)�� �� 3����(0.3) ������ ����
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 1 - 7*0.1 �Ϲ����� ��� ���� ? 0.3�� ��������? 0.29999999999999993
		double result = apple - number * pieceUnit;
		System.out.println("��� 1������ ���� �� : "  + result);
				

	}

}
