package programmers;

public class programmers03_03 {

	public static void main(String[] args) {
/*
 문자열 my_string과 정수 k가 주어질 때, 
 my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
		String my_string = "string";
		int k = 3;
		String answer = "";
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		System.out.println(answer);
        
//		System.out.print(my_string.repeat(k));
//		java 11부터 추가된 repeat기능을 이용하면 한줄로 가능하다

	}

}
