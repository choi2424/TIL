package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
//		����Ÿ���� �ּҺ���(����)
		
		int[] scores;
		scores = new int[] { 83 , 90 , 87 };
		
		sum(scores);
		
		
		sum( new int[] { 83 , 90 , 87 }); // �������� �����Ͱ� ����Ǿ� �ִ� �ּҴ���
		sum(scores);
		sum( new int[] { 50 , 85 , 64 });
		sum(scores);
		sum( new int[] { 98 , 88 , 77 });
		sum(scores);
		
		
	}

//	�޼ҵ� ����(����)
	public static void printItem(int[] scores) {
		sum(scores);
	} 	
	
//	�հ踦 ���ϴ� �޼���
	public static void sum(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		System.out.println("�հ� : " + sum + scores.length);
		System.out.println("��� : " + (double) sum / scores.length);
		}
	}
}
