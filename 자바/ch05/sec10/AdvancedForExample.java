package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
//		배열을 접근하기위한 향상된 for문
		
		int[] scores = { 95 , 71 , 84 , 93 , 87 };
		
//		배열합
		int sum = 0;
		
//		1)
		/*
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		*/
		
//		2) 향상된 for문 for(변수 : 배열)
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
//		배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
