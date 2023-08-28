package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
//		3항 연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다");
		
//		if문 , printf() 사용해서 코드처리
		
		if(score > 90) {
			grade = 'A';
		}else if(score > 80) {
			grade = 'B';
		}else {
			grade = 'C';
		}
//		%d 정수형식 , %c 단일문자형식, %f 소수점 형식, %s 문자열 형식
		System.out.printf("%d점은 %c등급입니다" , score,grade);
	}

}
