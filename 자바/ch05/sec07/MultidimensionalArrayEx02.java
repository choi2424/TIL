package ch05.sec07;

public class MultidimensionalArrayEx02 {

	public static void main(String[] args) {
		
//		int[][] mathScores = new int[���� ��][���� ��]; 
		
//		int�� �迭�� �ʱⰪ�� 0���� �ڵ�����
		int[][] mathScores = new int[2][3]; // 2*3 (2�� 3���� 2�������ı���)
		
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("%d�� %d�� \t", i + 1,j + 1);
			}
			
		}
		System.out.println();
		
//		�迭 �׸��� �� ����
//		ù ��° ��
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
//		�� ��° ��
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
//		��ü �л��� ���� ��� ���ϱ�
		int totalStudent = 0;
		int totalMathSum = 0;
		
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				totalStudent++;
				totalMathSum += mathScores[i][j];
			}
		}
		
		double totalMathAvg = (double)totalMathSum / totalStudent;
		System.out.printf(""
				+ "��ü �л��� ��  : %d \n"
				+ "��ü �л��� �������� �� : %d \n"
				+ "��ü �л��� ���� ��� : %.1f��" ,
				totalStudent,totalMathSum,totalMathAvg);
		System.out.println();
		
//		�����迭 (jagged array) : �ึ�� ����ũ�Ⱑ �ٸ��� ���Ǵ� Ư¡ , ����
		int[][] englishScores = new int[2][]; // ���� ũ�⸦ ����
		englishScores[0] = new int[2]; // ù ��° ���� ���� ũ�⸦ 2�� ����
		englishScores[1] = new int[3]; // �� ��° ���� ���� ũ�⸦ 3�� ����
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.printf("%d�� %d�� \t", i + 1,j + 1);
			}
			
		}
		System.out.println();
//		 90 91 92 93 94
		
//		englishScores �迭 ���� ���� �����ϴ� ����
//		ù ��° ��
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
//		�� ��° ��
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		
		
//		for �� 
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				totalStudent++;
				totalEnglishSum += englishScores[i][j]; 
				
			}
		}
		double totalEnglishAvg = (double)totalEnglishSum / totalStudent;
//		������ ���
		System.out.printf("��ü �л��� ���� ���� ��� %.1f" , totalEnglishAvg);
	}

}
