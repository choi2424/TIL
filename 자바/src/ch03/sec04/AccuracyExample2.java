package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {
//		�Ǽ�������Ÿ���� �ε��Ҽ��� ������� ���� ���� �����߻� ����
//		���� ? ���1���� 0.1������ 10�������� ����, �� �� 7����(0.7)�� �� 3����(0.3) ������ ����
//		�ذ� : 1)������ ��ȯ�ϴ� ��� . 2)BigDecimal Ŭ���� ���. 3)���̺귯�� �̿�.
		int apple = 1;
//		double pieceUnit = 0.1;
		int totalPieces = apple *10;
		int number = 7;
		
		
		double result = totalPieces - number;
		System.out.println("10�������� ���� ���� : " + result);
		System.out.println("��� 1������ ���� �� : "  + result / 10.0);
				

	}

}
