package programmers;

public class programmers03_01 {

	public static void main(String[] args) {
/*
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 
 * return 하는 solution 함수를 완성해주세요.
 */	
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String solution = "";
		
		for (int i = 0; i < str1.length(); i++) {
		
			solution += str1.charAt(i);
			solution += str2.charAt(i);
		
		}
		
		System.out.println(solution);
		
	}
	
}
			
		

