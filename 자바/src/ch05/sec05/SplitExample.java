package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
//		���ڿ� �и�
		
		String board = "1,�ڹ� �н�,���� Ÿ��String�� �н��մϴ�.,ȫ�浿"; // �޸�(,) ������
		
//		���ڿ� �и�
		String[] tokens = board.split(",");
		
//		�ε������� �б�
		System.out.println("��ȣ : " + tokens[0]);
		System.out.println("��ȣ : " + tokens[1]);
		System.out.println("��ȣ : " + tokens[2]);
		System.out.println("��ȣ : " + tokens[3]);
		System.out.println();
		
//		for�� �̿��Ͽ� �б�
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
