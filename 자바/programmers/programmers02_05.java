package programmers;

public class programmers02_05 {

	public static void main(String[] args) {
//		���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. 
//		���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� 
//		���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
		
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
	/* ����ϰ� Ǯ���ٰ� �����Ǵ� ��
	 * String before = my_string.substring(0, s); 
	 * String after = my_string.substring(s + overwrite_string.length());
	 * System.out.println(before+ b + after);
	 */        
	}

}
