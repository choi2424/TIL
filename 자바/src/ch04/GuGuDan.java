package ch04;

public class GuGuDan {

	public static void main(String[] args) {
//		������ ���� �ǽ�
		
//		System.out.println();  �ٹٲ� ����
//		System.out.print();  �ٹٲ� ����
//		System.out.printf(); ������ ���
		
		
		
		
		for (int i = 0; i <= 9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 0) {
					System.out.printf("|    [%d ��]\t",j);
				}else {
					System.out.printf("|  %d x %d = %2d \t",j,i,j*i);
				}
			}
			System.out.println();
			
			
		}

	}

}
