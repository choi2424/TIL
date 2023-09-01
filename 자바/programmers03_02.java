package programmers;

public class programmers03_02 {

	 public static void main(String[] args) {
//		문자들이 담겨있는 배열 arr가 주어집니다. 
//		arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
		
//		입출력 예
//		arr				result
//		["a","b","c"]	"abc"
		String[] arr = {"a","b","c"};
		String answer = "";
		
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
		
//		
		/*
		한줄처리가 가능한 코드였다 
		System.out.println(String.join("",arr));
		 */
	 }
}
