package ch05.sec07;

public class MultidimensionalArrayEx02 {

	public static void main(String[] args) {
		
//		int[][] mathScores = new int[행의 수][열의 수]; 
		
//		int형 배열은 초기값이 0으로 자동생성
		int[][] mathScores = new int[2][3]; // 2*3 (2행 3열의 2차원병렬구조)
		
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("%d행 %d열 \t", i + 1,j + 1);
			}
			
		}
		System.out.println();
		
//		배열 항목의 값 변경
//		첫 번째 행
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
//		두 번째 행
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
//		전체 학생의 수학 평균 구하기
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
				+ "전체 학생의 수  : %d \n"
				+ "전체 학생의 수학점수 합 : %d \n"
				+ "전체 학생의 수학 평균 : %.1f점" ,
				totalStudent,totalMathSum,totalMathAvg);
		System.out.println();
		
//		가변배열 (jagged array) : 행마다 열의크기가 다르게 사용되는 특징 , 톱모양
		int[][] englishScores = new int[2][]; // 열의 크기를 생략
		englishScores[0] = new int[2]; // 첫 번째 행은 열의 크기를 2로 설정
		englishScores[1] = new int[3]; // 두 번째 행은 열의 크기를 3로 설정
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.printf("%d행 %d열 \t", i + 1,j + 1);
			}
			
		}
		System.out.println();
//		 90 91 92 93 94
		
//		englishScores 배열 위의 값을 대입하는 구문
//		첫 번째 행
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
//		두 번째 행
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		
		
//		for 문 
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				totalStudent++;
				totalEnglishSum += englishScores[i][j]; 
				
			}
		}
		double totalEnglishAvg = (double)totalEnglishSum / totalStudent;
//		변수값 출력
		System.out.printf("전체 학생의 영어 점수 평균 %.1f" , totalEnglishAvg);
	}

}
