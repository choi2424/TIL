package programmers;

public class programmers02_03 {

	public static void main(String[] args) {
		/*
		 * 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
		 * abcde
		 * 
		    a
			b
			c
			d
			e
		 */
		String a = "abcde";
		
		
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
	}

}
