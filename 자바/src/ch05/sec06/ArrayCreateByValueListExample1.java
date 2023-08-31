package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		/*
		배열 - 동일한 데이터타입의 값을 저장하기 위한 연속적인 형태의 기억장소(자료구조)
		
		데이터타입[] 변수 = new 데이터타입[길이]
		
		데이터타입 : 1)기본데이터타입 2)참조타입
		
		배열은 참조타입이다.
		*/
		
//		1)기본데이터타입을 이용한 배열
		int[] scores = {83 , 90 , 87}; // 힙영역에 생성된 기억장소의 값은 int형으로 한다.
		
//		총합과 평균 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합  : " + sum);
		System.out.println("평균  : " + ((double)sum / scores.length));

//		2)참조타입을 이용한 배열
		
		String[] season = { "Spring" , "Summer" , "Fall" , "Winter" };
		
//		배열의 항목값 읽기
		for (int i = 0; i < season.length; i++) {
			
			System.out.printf("season[%d] : %s\n" , i,season[i]); // 힙영역에 각각의 데이터의 저장된 주소를통하여 데이터를 읽기
		}
//		인덱스 1번값의 데이터를 변경
		season[1] = "여름";
		System.out.println(season[1]);
				
	}

}
