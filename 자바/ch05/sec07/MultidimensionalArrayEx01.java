package ch05.sec07;

public class MultidimensionalArrayEx01 {

	public static void main(String[] args) {
//		다차원배열
		/* 
		int[] arr : 1차원배열
		int[][] arr : 2차원배열
		int[][][] arr : 3차원배열
		
		1차원 배열
		int[] arr = { 80 , 90 , 96 };
		arr.length = 3
		arr[0] 80
		arr[1] 90
		arr[2] 96
	
		*/	
		
//		2차원 배열생성
		int[][] scores = {
				{ 80 , 90 , 96 } ,  // 1반 scores[0]
				{ 76 , 88 } 		// 2반 scores[1]
		};
				
//		배열의 길이
		System.out.printf("1차원 배열 길이(반의 수) : %d \n" , scores.length); // 행의 개수
		System.out.printf("2차원 배열 길이(1반의 학생 수) : %d \n" , scores[0].length); // 학생 수 
		System.out.printf("2차원 배열 길이(2반의 학생 수) : %d \n" , scores[1].length); // 학생 수
		
//		첫 번째 반의 세 번째 학생의 점수 읽어오기
		System.out.printf("1반의 세 번째 학생 시험점수 : %d \n" , scores[0][2]); // 시험 점수
		
//		두 번째 반의 두 번째 학생의 점수 읽어오기
		System.out.printf("2반의 두 번째 학생 시험점수 : %d \n" , scores[1][1]); // 시험 점수
		
//		첫 번째 반의 평균점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.printf("1반의 학생 시험 평균점수  : %f \n" , (double)class1Sum / scores[0].length);
		
//		두 번째 반의 평균점수 구하기
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.printf("2반의 학생 시험 평균점수  : %f \n" , (double)class2Sum / scores[1].length);
		
//		전체 학생의 평균점수 구하기
		int totalStudent = 0; // 학생수
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				totalStudent++;
				totalSum += scores[i][j];
			}
		}
		System.out.printf("전체 학생의 평균점수  : %f \n" , (double)totalSum  / totalStudent);
		
	}

}
