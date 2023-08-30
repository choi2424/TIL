package ch05.sec07;

public class MultidimensionalArrayEx01 {

	public static void main(String[] args) {
//		�������迭
		/* 
		int[] arr : 1�����迭
		int[][] arr : 2�����迭
		int[][][] arr : 3�����迭
		
		1���� �迭
		int[] arr = { 80 , 90 , 96 };
		arr.length = 3
		arr[0] 80
		arr[1] 90
		arr[2] 96
	
		*/	
		
//		2���� �迭����
		int[][] scores = {
				{ 80 , 90 , 96 } ,  // 1�� scores[0]
				{ 76 , 88 } 		// 2�� scores[1]
		};
				
//		�迭�� ����
		System.out.printf("1���� �迭 ����(���� ��) : %d \n" , scores.length); // ���� ����
		System.out.printf("2���� �迭 ����(1���� �л� ��) : %d \n" , scores[0].length); // �л� �� 
		System.out.printf("2���� �迭 ����(2���� �л� ��) : %d \n" , scores[1].length); // �л� ��
		
//		ù ��° ���� �� ��° �л��� ���� �о����
		System.out.printf("1���� �� ��° �л� �������� : %d \n" , scores[0][2]); // ���� ����
		
//		�� ��° ���� �� ��° �л��� ���� �о����
		System.out.printf("2���� �� ��° �л� �������� : %d \n" , scores[1][1]); // ���� ����
		
//		ù ��° ���� ������� ���ϱ�
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.printf("1���� �л� ���� �������  : %f \n" , (double)class1Sum / scores[0].length);
		
//		�� ��° ���� ������� ���ϱ�
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.printf("2���� �л� ���� �������  : %f \n" , (double)class2Sum / scores[1].length);
		
//		��ü �л��� ������� ���ϱ�
		int totalStudent = 0; // �л���
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				totalStudent++;
				totalSum += scores[i][j];
			}
		}
		System.out.printf("��ü �л��� �������  : %f \n" , (double)totalSum  / totalStudent);
		
	}

}
