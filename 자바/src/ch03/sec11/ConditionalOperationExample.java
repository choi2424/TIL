package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
//		3�� ������
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "����" + grade + "����Դϴ�");
		
//		if�� , printf() ����ؼ� �ڵ�ó��
		
		if(score > 90) {
			grade = 'A';
		}else if(score > 80) {
			grade = 'B';
		}else {
			grade = 'C';
		}
//		%d �������� , %c ���Ϲ�������, %f �Ҽ��� ����, %s ���ڿ� ����
		System.out.printf("%d���� %c����Դϴ�" , score,grade);
	}

}
