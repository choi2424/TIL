package programmers;

public class programmers03_02 {

	 public static void main(String[] args) {
//		���ڵ��� ����ִ� �迭 arr�� �־����ϴ�. 
//		arr�� ���ҵ��� ������� �̾� ���� ���ڿ��� return �ϴ� solution�Լ��� �ۼ��� �ּ���.
		
//		����� ��
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
		����ó���� ������ �ڵ忴�� 
		System.out.println(String.join("",arr));
		 */
	 }
}
