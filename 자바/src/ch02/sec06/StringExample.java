package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
//		String : 문자열 데이터 저장목적
//		"" 큰따옴표 사용.
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바과정\"을 잘 수료해서, 개발자로 나갈꺼다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		
		System.out.println(str);
		
		System.out.println("나는\n자바를 \n배웁니다.");
		

	}

}
