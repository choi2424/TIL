package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
//		참조타입의 주소복사(대입)
		
		int[] scores;
		scores = new int[] { 83 , 90 , 87 };
		
		sum(scores);
		
		
		sum( new int[] { 83 , 90 , 87 }); // 힙영역에 데이터가 저장되어 있는 주소대입
		sum(scores);
		sum( new int[] { 50 , 85 , 64 });
		sum(scores);
		sum( new int[] { 98 , 88 , 77 });
		sum(scores);
		
		
	}

//	메소드 정의(선언)
	public static void printItem(int[] scores) {
		sum(scores);
	} 	
	
//	합계를 구하는 메서드
	public static void sum(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		System.out.println("합계 : " + sum + scores.length);
		System.out.println("평균 : " + (double) sum / scores.length);
		}
	}
}
