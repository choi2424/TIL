package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
//		�迭�� ũ�⸦ ���� �Ұ���.
//		�迭����
		
//		���̰� 3�� �迭
		int[] oldIntArray = { 1 , 2 , 3 };
		
//		���̰� 5�� �迭
		int[] newIntArray = new int[5]; // �迭�� int���̹Ƿ� �ʱⰪ�� 0 ���� ������
		
//		�迭����
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
//		�迭��� : �迭���� ����
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.printf("%d,", newIntArray[i]);
		}
	}

}
