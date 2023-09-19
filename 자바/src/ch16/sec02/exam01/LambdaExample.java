package ch16.sec02.exam01;

public class LambdaExample {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
//		실행문이 하나라면 {} 중괄호를 생략가능 . 실행문의 세미콜론(;) 생략한다
		person.action(() -> System.out.println("퇴근을 합니다."));
	}
}
