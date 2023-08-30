package programmers;

public class programmers02_05 {

	public static void main(String[] args) {
//		문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
//		문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
//		문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;
		
		String a = my_string;
		String b = overwrite_string;
		String answer = "";
		
		for (int i = 0; i < a.length() ; i++) {
			if(i < s-1) {
				answer += a.charAt(i);}
			else if (i > s -1&& i < s + b.length()) {
				answer += b.charAt(i-s);}
			else {
				answer += a.charAt(i);}
		}
		
		System.out.println(answer);
	/* 깔끔하게 풀었다고 생각되는 답
	 * String before = my_string.substring(0, s); 
	 * String after = my_string.substring(s + overwrite_string.length());
	 * System.out.println(before+ b + after);
	 */        
	}

}
