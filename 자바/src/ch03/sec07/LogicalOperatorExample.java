package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
//		�� ������
//		�ƽ�Ű �ڵ尪 ��뿹��
		
		int charCode = 'A'; // int = (int)char;
		
//		&, | vs && || ���ۿ����� �ٸ���
		
//		65 <= charCode <= 90
		if((65 <= charCode) && (charCode <= 90)) {
			System.out.println("�빮���Դϴ�.");
		}
		
//		�Ʒ� �������� ù��° ���ǽ��� false �̸�, �ι�° ���ǽ��� �Ǵ�(����)���� �ʴ´�.(�߿�)
		if((97 <= charCode) && (charCode <= 122)) {
			System.out.println("�ҹ����Դϴ�.");
		}

		if((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0-9�����Դϴ�.");
		}
		
//		�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		int value = 6;
		
		if(( value % 2 == 0 ) | ( value %3 == 0)) {
			System.out.println("2�Ǵ� 3�� ����̱���.");
		}
//		�Ʒ� �������� ù ��° ���ǽ��� true �̸� ,�� ��° ���ǽ��� �Ǵ�(����)���� �ʴ´�.(�߿�)
		boolean result = (value %2 == 0) || (value %3 == 0);
		if(!result) {
			System.out.println("2�Ǵ� 3�� ����� �ƴϱ���.");
		}
	}

}
